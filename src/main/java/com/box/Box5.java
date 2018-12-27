package com.box;

public class Box5 extends Box{


    public Box5() {
        super(39.5f, 27.5f, 23f);
    }

    @Override
    boolean validate(float length, float width, float height) {
        return (this.length > length) && (this.width > width) && (this.height > height);
    }

    @Override
    public void printMatchSize() {
        System.out.println(Box5.class.getSimpleName());
    }


}
