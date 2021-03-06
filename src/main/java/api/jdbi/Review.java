package api.jdbi;

import org.hibernate.validator.constraints.NotEmpty;

public class Review {
    private int id;
    private String timestamp;
    @NotEmpty
    private String title;
    @NotEmpty
    private String body;
    @NotEmpty
    private String image;
    @NotEmpty
    private String link;
    @NotEmpty
    private String author;

    public Review() {
        super();
    }

    public Review(int  id, String title, String body, String timestamp, String image, String link, String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
        this.image = image;
        this.link = link;
        this.author = author;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle() {this.title = title;}
    public String getBody() {return body;}
    public void setBody(String body) {this.body = body;}
    public void setTimestamp(String timestamp) {this.timestamp = timestamp;}
    public String getTimestamp() {return timestamp;}
    public String getImage() {return image;}
    public String getLink() {return link;}
    public void setImage(String image) {this.image = image;}
    public void setLink(String link) {this.link = link;}
    public void setAuthor(String author) {this.author = author;}
    public String getAuthor() {return author;}
}
