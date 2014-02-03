package com.shwetado.news;

import java.util.List;

public class HtmlFormat implements Formattable{

    @Override
    public String getFormattedText(String title, List<Headline> headlines) {
        StringBuilder text = new StringBuilder("Report\n");
        text.append("<h1>").append(title).append("</h1>").append("\n<ul>\n");
        for (Headline headline : headlines) {
            text.append("<li>").append(headline).append("</li>\n");
        }
        text.append("</ul>");
        return text.toString();
    }
}
