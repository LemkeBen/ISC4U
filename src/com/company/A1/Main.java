package com.company.A1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("word?");
            String string = scanner.nextLine();
            char[] word = string.toCharArray();
            char [][] array2d = new char [word.length + 2] [word.length + 2];
            for (int r = 0; r < word.length + 2; r ++) {
                for (int c = 0; c < word.length + 2; c++) {
                    array2d[r][c] = '*';
                }
            }

            String outsideWord = '*' + string;

            for (int i = 0; i < outsideWord.length(); i++){
                array2d[i][outsideWord.length()] = outsideWord.charAt(i);
                array2d[outsideWord.length()][outsideWord.length() - i] = outsideWord.charAt(i);
                array2d[0][i] = outsideWord.charAt(i);
                array2d[outsideWord.length() - i][0] = outsideWord.charAt(i);

            }

            for (int r = 0; r < word.length + 2; r ++){
                for (int c = 0; c < word.length + 2; c++){
                    System.out.print(array2d[r][c]);
                }
                System.out.println("");
            }
        }
        while(!scanner.nextLine().equals("no"));
}
}
