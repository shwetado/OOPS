package com.shwetado.news;

import java.util.List;

public class Formatter implements Formattable{

    @Override
    public String getFormattedText(String title, List<Headline> headlines) {
        StringBuilder text = new StringBuilder("REPORT\n");
        text.append(title).append("\n");
        for (int i = 0; i < headlines.size(); i++)
            text.append(i + 1).append(". ").append(headlines.get(i)).append("\n");
        return text.toString();
    }
}
