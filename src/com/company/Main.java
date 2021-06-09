package com.company;
import java.util.Scanner;
public class Main {

    private static int printArea;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        printArea(width, height);
    }

  

    //complete the method
    public static void printArea(int width, int height){
        printArea = width * height;
        System.out.println(printArea);

    }
}
