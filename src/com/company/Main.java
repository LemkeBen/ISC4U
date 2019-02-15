package com.company;

public class Main {

    public static void main(String[] args) {
	char[] word = "hello world".toCharArray();
	System.out.print("*");
    for (char c : word) {
        System.out.print(c);
        System.out.print(" ");
    }
	System.out.println("*");
	for (int i = 0; i < word.length; i++){
        System.out.print(word[word.length - i - 1]);
        System.out.print(" ");
        for (int x = 0; x < word.length; x++) {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.print(word[i]);
        System.out.println("");
    }
    System.out.print("*");
    for (int i = 0; i < word.length; i++) System.out.print(word[word.length - i - 1]);
    System.out.println("*");
    }
}
