package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            String fileName = "/Users/nikita/Documents/Hometask/Programming/Java/Hometask-8/Hometask-8/fileText.txt";
            List <String> listText = readUsingFileReader(fileName);
            List <String> listTextResult = new ArrayList<>();

            Scanner in = new Scanner(System.in);

            System.out.print("\nView a text?\n1 - See\n2 - Skip\nEnter: ");
            int variantSeeText = in.nextInt();
            switch(variantSeeText) {
                case 1 -> {
                   printText(listText);
                }
            }
            listTextResult = removeSpaces(listText);
            printText(listTextResult);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static List<String> readUsingFileReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<String> stringList = new ArrayList();
        while ((line = br.readLine()) != null) {
            stringList.add(line);
        }
        br.close();
        fr.close();
        return stringList;
    }

    public static void printText(List <String> listText) {
        System.out.println("Start of text");
        for (int i = 0; i < listText.size(); ++i) {
            System.out.println(listText.get(i));
        }
        System.out.println("End of text\n");
    }

    public static List <String> removeSpaces(List <String> listText) {
        List <String> listTextResult = new ArrayList<>();
        for (int i = 0; i < listText.size(); ++i) {
            listTextResult.add((listText.get(i)).trim().replaceAll("\\s{2,}", " "));
        }
        return listTextResult;
    }
}
