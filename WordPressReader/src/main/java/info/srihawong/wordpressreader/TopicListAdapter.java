package info.srihawong.wordpressreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Banpot.S on 10/1/2557.
 */
public class TopicListAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<TopicListItem> listData = new ArrayList<TopicListItem>();
    private LayoutInflater mInflater;

    public TopicListAdapter(Context context, ArrayList<TopicListItem> listData) {
        this.listData = listData;
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public TopicListItem getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
           TopicListItemView topicListItemView;
           if(view==null){
               view = mInflater.inflate(R.layout.content_list,null);
               topicListItemView = new TopicListItemView();
               topicListItemView.title = (TextView) view.findViewById(R.id.title);
               topicListItemView.created = (TextView) view.findViewById(R.id.created);
               topicListItemView.description = (TextView) view.findViewById(R.id.description);
               topicListItemView.imageCover = (ImageView) view.findViewById(R.id.imageCover);
               view.setTag(topicListItemView);
           }else{
               topicListItemView = (TopicListItemView) view.getTag();
           }
        TopicListItem item = listData.get(position);
        String createdText = "โดย " + item.getUsername()+" เมื่อ"+item.getCreated().toString();
        topicListItemView.title.setText(item.getTitle());
        topicListItemView.created.setText(createdText);
        topicListItemView.description.setText(item.getDescription());
        topicListItemView.imageCover.setImageURI(item.getImageCoverUrl());
        return view;
    }
}
