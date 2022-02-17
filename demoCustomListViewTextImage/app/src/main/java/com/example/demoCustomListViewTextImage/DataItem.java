package com.example.customlistviewtextimage;

public class DataItem {
    private String itemDescription;
    private int thumbnailImage;

    public DataItem(String itemDescription, int thumbnailImage) {
        this.itemDescription = itemDescription;
        this.thumbnailImage = thumbnailImage;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(int thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }
}
