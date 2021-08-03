//Lab 5
//Exercise 1

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromCSVFile {

    public static void main(String[] args) {
        try {
            Scanner fin = new Scanner(new FileInputStream("/Users/HeidyRodriguez/Desktop/Cyber Security/Summer 2021 Courses/Programming Fundamentals/Week 5/input.csv"));
            String[] words;
            int max, num;
            String line;
            int row = 1;
            while (fin.hasNextLine()) {
                line = fin.nextLine();
                words = line.trim().split(",");
                max = Integer.parseInt(words[0]);
                for(int i = 0; i < words.length; ++i) {
                    num = Integer.parseInt(words[i]);
                    if(num > max) {
                        max = num;
                    }
                }
                System.out.println("ROW " + row + ": " + max);
                row++;
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}