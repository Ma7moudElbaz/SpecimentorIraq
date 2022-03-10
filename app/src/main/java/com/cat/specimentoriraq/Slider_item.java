package com.cat.specimentoriraq;

public class Slider_item {

   final int imageDrawable;
    final boolean hasReadMore;

    public Slider_item(int imageDrawable, boolean hasReadMore) {
        this.imageDrawable = imageDrawable;
        this.hasReadMore = hasReadMore;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public boolean isHasReadMore() {
        return hasReadMore;
    }
}
