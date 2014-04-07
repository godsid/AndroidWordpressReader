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
public class CommentListAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<CommentListItem> listData = new ArrayList<CommentListItem>();
    private LayoutInflater mInflater;

    public CommentListAdapter(Context context, ArrayList<CommentListItem> listData) {
        this.listData = listData;
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public CommentListItem getItem(int position) {
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
               view = mInflater.inflate(R.layout.comment_list,null);
               topicListItemView = new TopicListItemView();
               topicListItemView.created = (TextView) view.findViewById(R.id.created);
               topicListItemView.description = (TextView) view.findViewById(R.id.description);
               view.setTag(topicListItemView);
           }else{
               topicListItemView = (TopicListItemView) view.getTag();
           }
        CommentListItem item = listData.get(position);
        String createdText = "โดย " + item.getUsername()+" เมื่อ"+item.getCreated().toString();

        topicListItemView.created.setText(createdText);
        topicListItemView.description.setText(item.getDescription());

        return view;
    }
}
