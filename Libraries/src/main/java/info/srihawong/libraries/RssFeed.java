package info.srihawong.libraries;

/**
 * Created by godsid on 4/5/14.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class RssFeed implements Parcelable {



    private String title;
    private String link;
    private String description;
    private String language;
    private String commentsRss;
    private String commentsCount;
    private String pubDate;
    private String creator;
    private String[] category;
    private ArrayList<RssItem> rssItems;

    public RssFeed() {
        rssItems = new ArrayList<RssItem>();
    }

    public RssFeed(Parcel source) {

        Bundle data = source.readBundle();
        title = data.getString("title");
        link = data.getString("link");
        commentsRss = data.getString("commentsRss");
        commentsCount = data.getString("commentsCount");
        pubDate = data.getString("pubDate");
        category = data.getStringArray("category");
        creator = data.getString("creator");
        description = data.getString("description");
        language = data.getString("language");
        rssItems = data.getParcelableArrayList("rssItems");

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        Bundle data = new Bundle();
        data.putString("title", title);
        data.putString("link", link);
        data.putString("description", description);
        data.putString("language", language);
        data.putString("commentsRss",commentsRss);
        data.putString("commentsCount",commentsCount);
        data.putString("pubDate",pubDate);
        data.putStringArray("category",category);
        data.putString("creator",creator);
        data.putParcelableArrayList("rssItems", rssItems);
        dest.writeBundle(data);
    }

    public static final Creator<RssFeed> CREATOR = new Creator<RssFeed>() {
        public RssFeed createFromParcel(Parcel data) {
            return new RssFeed(data);
        }
        public RssFeed[] newArray(int size) {
            return new RssFeed[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    void addRssItem(RssItem rssItem) {
        rssItems.add(rssItem);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<RssItem> getRssItems() {
        return rssItems;
    }

    public void setRssItems(ArrayList<RssItem> rssItems) {
        this.rssItems = rssItems;
    }

    public String getCommentsRss() {
        return commentsRss;
    }

    public void setCommentsRss(String commentsRss) {
        this.commentsRss = commentsRss;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }
}