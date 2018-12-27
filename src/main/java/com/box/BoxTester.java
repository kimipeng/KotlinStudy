package com.box;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        float length = 0;
        float width = 0;
        float height = 0;

        String[] strings = {"length", "width", "height"};
        Map<String, Float> dataMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // 用Scanner讀取輸入值
        for (String askString : strings) {
            System.out.print(String.format("Please enter object's %s: ", askString));
            dataMap.put(askString, scanner.nextFloat());
        }

        length = dataMap.get(strings[0]);
        width = dataMap.get(strings[1]);
        height = dataMap.get(strings[2]);

        // 先判定Box5是否裝得下，再判定Box3。
       if (box5.validate(length, width, height)) {

           if (box3.validate(length, width, height)) {
               box3.printMatchSize();
           } else {
               box5.printMatchSize();
           }
        } else {
           System.out.println("Box3 & Box5 dose not match.");
       }

    }



}
