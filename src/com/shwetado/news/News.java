package com.shwetado.news;

import java.util.ArrayList;
import java.util.List;

public class News {
    private final String title;
    private List<Headline> headLinesList ;

    public News(String title){
        this.title = title;
        this.headLinesList = new ArrayList<>();
    }

    public void addNews(String headLines){
        this.headLinesList.add(new Headline(headLines));
    }

    public void printHeadlines (Formattable formattable){
        System.out.println(formattable.getFormattedText(this.title, this.headLinesList));
    }

}
