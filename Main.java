package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void task1_1() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Computer");
        arrayList.add("Plate");
        arrayList.add("Chair");
        arrayList.add("Girl");
        arrayList.add("Boy");
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Shirt");
        arrayList.add("Determination");
        int count = 0;
        for (String element : arrayList) {
            if (element.startsWith("C"))
                count++;
        }
        System.out.println("Values that starts with letter C: " + count);

        int count1 = 0;
        for (String element : arrayList) {
            if (element.endsWith("e"))
                count1++;
        }
        System.out.println("Values that ends with letter E: " + count1);

        int count2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == 5)
                count2++;
        }
        System.out.println("Values with length 5: " + count2);

        int count3 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Pattern pattern = Pattern.compile("([e])");
            Matcher matcher = pattern.matcher(arrayList.get(i));
            if (matcher.find()) {
                count3++;
            }
        }
        System.out.println("Values that consists of character 'e': " + count3);

        int count4 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            boolean b = arrayList.get(i).matches("(?i).*te.*");
            if (b) {
                count4++;
            }
        }
        System.out.println("Values that consists of subString 'te': " + count4);

//Sorting array list using bubble sort
        String temp;
        System.out.println("ArrayList sorted by first letter in alphabetical order: ");
        for (int j = 0; j < arrayList.size(); j++) {
            for (int i = j + 1; i < arrayList.size(); i++) {
                if (arrayList.get(i).compareTo(arrayList.get(j)) < 0) {
                    temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(i));
                    arrayList.set(i, temp);
                }
            }
            System.out.println(arrayList.get(j));
        }
    }

    public static void main(String[] args) {
        task1_1();


    }
}
