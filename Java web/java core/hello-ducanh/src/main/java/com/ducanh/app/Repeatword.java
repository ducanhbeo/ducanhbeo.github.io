package com.ducanh.app;

import java.util.Scanner;

public class Repeatword {
    public static void main(String[] args) {

        String name = "welcome";
        char c;
        String newname = "";
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            newname += "" +c+c;
        }
        System.out.println(newname);

    }
}
