package com.company.A3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3Q1 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter a number");
        String num = "";
        try {
            num = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sum = 0;
        int n = 0;
        for(int i = 0;i<num.length();i++){
            n = Character.getNumericValue(num.charAt(i));
            sum += (n);
        }

        System.out.println(num + "'s digits have a sum of" + sum);

    }
}
