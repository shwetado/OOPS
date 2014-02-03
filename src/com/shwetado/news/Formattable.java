package com.shwetado.news;

import java.util.List;

public interface Formattable {
    public String getFormattedText(String title, List<Headline> headlines);
}
