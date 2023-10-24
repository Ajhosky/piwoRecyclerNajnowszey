package com.example.piwo;

public class Beer {
    private String name;
    private int imageResource;

    public Beer(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}
