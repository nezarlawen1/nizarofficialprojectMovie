package com.example.hp1.nizarofficialprojectmovies;

public class Movies {
    private int image;
    private  int name;

    public Movies(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }


}
