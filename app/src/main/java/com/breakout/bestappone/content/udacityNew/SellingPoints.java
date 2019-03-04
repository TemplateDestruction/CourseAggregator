
package com.breakout.bestappone.content.udacityNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SellingPoints {

    @SerializedName("images_url")
    @Expose
    private Object imagesUrl;
    @SerializedName("selling_keys")
    @Expose
    private Object sellingKeys;

    public Object getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(Object imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    public Object getSellingKeys() {
        return sellingKeys;
    }

    public void setSellingKeys(Object sellingKeys) {
        this.sellingKeys = sellingKeys;
    }

}
