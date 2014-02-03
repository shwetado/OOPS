package com.shwetado.news;

public class NewsCli {

    public static void main(String[] args) {
        News news = new News("The Times of India");
        news.addNews("hello");
        news.addNews("news");
        news.printHeadlines(new Formatter());
        news.printHeadlines(new HtmlFormat());
    }
}
