package nusiss.vttp.sathyassfassessment.models;

public class GetArticles {

   private String id;
   private String published_on;
   private String title;
   private  String url;
   private String imageurl;
   private  String body;
   private String tags;
   private String categories;

public GetArticles (String id, String published_on, String title, String url, String imageurl, String body, String tags,
        String categories) {
    this.id = id;
    this.published_on = published_on;
    this.title = title;
    this.url = url;
    this.imageurl = imageurl;
    this.body = body;
    this.tags = tags;
    this.categories = categories;


}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getPublished_on() {
    return published_on;
}

public void setPublished_on(String published_on) {
    this.published_on = published_on;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getUrl() {
    return url;
}

public void setUrl(String url) {
    this.url = url;
}

public String getImageurl() {
    return imageurl;
}

public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
}

public String getBody() {
    return body;
}

public void setBody(String body) {
    this.body = body;
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

@Override
public String toString() {
    return "News [body=" + body + ", categories=" + categories + ", id=" + id + ", imageurl=" + imageurl
            + ", published_on=" + published_on + ", tags=" + tags + ", title=" + title + ", url=" + url + "]";
}


   
    

}
