package com.box;

public abstract class Box {

    float length;
    float width;
    float height;

    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    abstract boolean validate(float length, float width, float height);

    abstract void printMatchSize();




}
