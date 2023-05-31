package com.ducanh.app;

import java.util.Scanner;

public class buoi2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = sc.nextLine();

        System.out.println("Nhap tuoi");
        int age = sc.nextInt();

        System.out.println(name + "co tuoi la" +age);
    }
}
