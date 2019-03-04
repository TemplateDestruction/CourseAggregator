
package com.breakout.bestappone.content.udacityNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Affiliate {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("name")
    @Expose
    private String name;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
