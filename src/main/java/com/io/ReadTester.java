package com.io;

import java.io.*;


public class ReadTester {


    // 有關InputStream and OutputStream說明，可看"InputStream & OutputStream.png"
    public static void main(String[] args) {

        bufferedReader();


        //inputStream();
        //fileReader();


    }

    private static void bufferedReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char)n);
                n = fr.read();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {

        File file = new File("data.txt");

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1) {
                System.out.print((char) n);
                n = is.read();
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
