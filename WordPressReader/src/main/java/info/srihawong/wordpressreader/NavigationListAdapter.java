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
 * Created by Banpot.S on 9/4/2557.
 */
public class NavigationListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<NavigationListItem> listData = new ArrayList<NavigationListItem>();
    private LayoutInflater mInflater;

    public NavigationListAdapter(Context context) {
        this.context = context;
    }

    public NavigationListAdapter(Context context, ArrayList<NavigationListItem> listData) {
        this.context = context;
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        NavigationListView navigationListView;
        if(view==null){
            view = mInflater.inflate(R.layout.navigation_list,null);
            navigationListView = new NavigationListView();
            navigationListView.title = (TextView) view.findViewById(R.id.navigation_title);
            navigationListView.icon = (ImageView) view.findViewById(R.id.navigation_icon);
            view.setTag(navigationListView);
        }else{
            navigationListView = (NavigationListView) view.getTag();
        }
        NavigationListItem item = listData.get(position);
        navigationListView.title.setText(item.getTitle());
        navigationListView.icon.setImageResource(item.getIcon());
        return view;
    }
}
