package info.srihawong.wordpressreader;

import android.net.Uri;

import java.net.URI;
import java.net.URL;

/**
 * Created by Banpot.S on 10/1/2557.
 */
public class TopicListItem {
    private int id,commentCount;
    private String title,username,description,tags,categories;
    private Long created;
    private Uri imageCoverUrl;

    public TopicListItem(int id, int commentCount, String title, String username, String description, String tags, String categories, Long created, Uri imageCoverUrl) {
        this.id = id;
        this.commentCount = commentCount;
        this.title = title;
        this.username = username;
        this.description = description;
        this.tags = tags;
        this.categories = categories;
        this.created = created;
        this.imageCoverUrl = imageCoverUrl;
    }
    public TopicListItem(int id,int commentCount, String title, String username, String description,long created){
        this.id = id;
        this.commentCount = commentCount;
        this.title = title;
        this.username = username;
        this.description = description;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Uri getImageCoverUrl() {
        return imageCoverUrl;
    }

    public void setImageCoverUrl(Uri imageCoverUrl) {
        this.imageCoverUrl = imageCoverUrl;
    }
}
