package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A1Q2 {
    public static void main(String[] args) {
        String [] inputs = new String[0];
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        boolean shouldContinue = true;
        String next;
        do{
            try {
                System.out.println("Line:");
                next = br.readLine();
            } catch (IOException e) {
                next = "";
                e.printStackTrace();
            }
            try {
                System.out.println("Do you want to add another line");
                if (br.readLine().equals("no")){
                    shouldContinue = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] nextList = new String[inputs.length + 1];
            for (int i = 0; i < inputs.length; i++){
                nextList[i] = inputs[i];
            }
            nextList[nextList.length - 1] = next;
            inputs = nextList;
        }
        while (shouldContinue);

        String [][] dir = {{"xooooo", "A"},{"xoxooo", "B"},{"xxoooo", "C"},{"xxoxoo", "D"},{"xooxoo", "E"},{"xxxooo", "F"},{"xxxxoo", "G"},{"xoxxoo", "H"},
                {"oxxooo", "I"},{"oxxxoo", "J"},{"xoooxo", "K"},{"xoxoxo", "L"},{"xxooxo", "M"},{"xxoxxo", "N"},{"xooxxo", "O"},{"xxxoxo", "P"},
                {"xxxxxo", "Q"},{"xoxxxo", "R"},{"oxxoxo", "S"},{"oxxxxo", "T"},{"xoooxx", "U"},{"xoxoxx", "V"},{"oxxxox", "W"},{"xxooxx", "X"},
                {"xxoxxx", "Y"},{"xooxxx", "Z"}};

        String [] input = inputs; //{"oxxoxooxoooxoxoooxxoxoooxooxxoooxoxxooxoooxoxoxoxo","xxxxooxxooxoxoooxxxxoxooooxooxoooxxoooooooxooxoxoo","oxooooxoooooxoooxoooooooxxxoooooxoooooooooooxoxoxo","oxoxoxxoxoxooxooxxoxxxoxxoxoxooxooxoxoooxxxoxxxoxoxooxxooxoxxoxxox","xxxoxxxxoxooxxooxoxoooxxooxxoxxooooxxxoooooxoxxooxxxxoooxxxooxoxxo","oxooxoooxoxxxoooxoooooxoxxxoooxoooxoxoooooxoxoxxooxoxoooxoooxoxoxo","xoxoooxxxxooxoxoxooxooxoxxxxoooxxooxoxxoxoxooxoo","oxxxoooooxoooxooxxxooooooxoxooxxxxxoxooooxxxxooo","xoooooxoxxooooooxoxoooooxooooooxooooxoxoooxoxooo","xoxooxooxoxooxxooooxoxoxooxxxooxoxoxxxxx","xxoxxxooxoooxxoxooxoxxxoooxxoxxxxxxooxxx","ooxooxooxoooxoooooooxoxoooooooxoxoooxooo","xxxoxooxxoxooxxoxoooxoxxxxooxxxoxooxxoxooxxoxo","ooooxxxooxooxooxxxoooooxoxooooooxxxooxooxooxxx","ooxxxoooxoxxxoooxoooooxoooooooxxxoooxoxxxoooxo"};
        String[] message = new  String[input.length / 3];
        for (int i = 0; i < input.length; i+= 3){
            StringBuffer m = new StringBuffer("");
            for (int j = 0; j < input[i].length(); j+= 2) {
                String[] brail = new String[3];
                brail[0] = input[i].substring(j, j + 2);
                brail[1] = input[i + 1].substring(j, j + 2);
                brail[2] = input[i + 2].substring(j, j + 2);
                String brailString = brail[0] + brail[1] + brail[2];
                String character = " ";
                for (int x = 0; x < dir.length; x++) {
                    if (dir[x][0].equals(brailString)) {
                        character = dir[x][1];
                        break;
                    }
                }
                m.append(character);
            }
            message[i/3] = m.toString();
        }
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
        }
    }
}