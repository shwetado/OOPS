package com.shwetado.news.cli;

import com.shwetado.news.Formatter;
import com.shwetado.news.HtmlFormat;
import com.shwetado.news.News;

public class NewsCli {

    public static void main(String[] args) {
        News news = new News("The Times of India");
        news.addNews("hello");
        news.addNews("news");
        news.printHeadlines(new Formatter());
        news.printHeadlines(new HtmlFormat());
    }
}
