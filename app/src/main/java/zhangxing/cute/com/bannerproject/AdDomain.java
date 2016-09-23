package zhangxing.cute.com.bannerproject;

/**
 * Created by zhangxing on 2016/9/23.
 * 广告类
 */
public class AdDomain {
    private String id; // 图片id
    private String date; // 发布时间
    private String title; // 标题
    private String topicFrom; //笔者
    private String topic; // 主题
    private String imgUrl; // 来源
    private boolean isAd; //是否广告

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public boolean isAd() {
        return isAd;
    }

    public void setAd(boolean isAd) {
        this.isAd = isAd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicFrom() {
        return topicFrom;
    }

    public void setTopicFrom(String topicFrom) {
        this.topicFrom = topicFrom;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
