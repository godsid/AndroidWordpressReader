package info.srihawong.wordpressreader;

import android.net.Uri;

/**
 * Created by Banpot.S on 10/1/2557.
 */
public class CommentListItem {
    private int id;
    private String username,description;
    private Long created;

    public CommentListItem(int id, String username, String description, Long created) {
        this.id = id;
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

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }
}
