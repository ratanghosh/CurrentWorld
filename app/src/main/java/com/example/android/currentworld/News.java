package com.example.android.currentworld;

public class News {

    // Title of the news
    private String mTitle;

    // Author of the news
    private String mSection;

    // Date of the website publication
    private String mDate;

    // url of the news
    private String mUrl;

    // url of the news
    private String mAuthor;

    public News(String title, String section, String date, String url, String author) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
        mAuthor = author;

    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }
}
