package com.company;

import java.util.*;

public class taskNumber2 {

    public static void main(String[] args) {
        System.out.println("Loop");
        String first = "Mom";
        if (PalindromeLoop(first))
            System.out.println("The word 'mom' is palindrome");
        else
            System.out.println("The word 'mom' is not palindrome");
        String second = "Was it a car or a cat I saw?";
        if (PalindromeLoop(second))
            System.out.println("The sentence 'Was it a car or a cat I saw?' is palindrome");
        else
            System.out.println("The sentence 'Was it a car or a cat I saw?' is not palindrome");
        String third = "Madam, in Eden, I’m Adam.";
        if (PalindromeLoop(third))
            System.out.println("The sentence 'Madam, in Eden, I’m Adam.' is palindrome");
        else
            System.out.println("The sentence 'Madam, in Eden, I’m Adam.' is not palindrome");
        String fourth = "Yo, banana boy!";
        if (PalindromeLoop(fourth))
            System.out.println("The sentence 'Yo, banana boy!' is palindrome");
        else
            System.out.println("The sentence 'Yo, banana boy!' is not palindrome");

        System.out.println("Stack and Queue");
        if (PalindromeStackandQueue(first))
            System.out.println("The word 'mom' is palindrome");
        else
            System.out.println("The word 'mom' is not palindrome");
        if (PalindromeStackandQueue(second))
            System.out.println("The sentence 'Was it a car or a cat I saw?' is palindrome");
        else
            System.out.println("The sentence 'Was it a car or a cat I saw?' is not palindrome");
        if (PalindromeStackandQueue(third))
            System.out.println("The sentence 'Madam, in Eden, I’m Adam.' is palindrome");
        else
            System.out.println("The sentence 'Madam, in Eden, I’m Adam.' is not palindrome");
        if (PalindromeStackandQueue(fourth))
            System.out.println("The sentence 'Yo, banana boy!' is palindrome");
        else
            System.out.println("The sentence 'Yo, banana boy!' is not palindrome");

        System.out.println("Deque");
        if (PalindromeDeque(first))
            System.out.println("The word 'mom' is palindrome");
        else
            System.out.println("The word 'mom' is not palindrome");
        if (PalindromeDeque(second))
            System.out.println("The sentence 'Was it a car or a cat I saw?' is palindrome");
        else
            System.out.println("The sentence 'Was it a car or a cat I saw?' is not palindrome");
        if (PalindromeDeque(third))
            System.out.println("The sentence 'Madam, in Eden, I’m Adam.' is palindrome");
        else
            System.out.println("The sentence 'Madam, in Eden, I’m Adam.' is not palindrome");
        if (PalindromeDeque(fourth))
            System.out.println("The sentence 'Yo, banana boy!' is palindrome");
        else
            System.out.println("The sentence 'Yo, banana boy!' is not palindrome");
    }

    private static boolean PalindromeLoop(String str) {
        int i = 0, j = str.length() - 1;
        str = str.toLowerCase();
        while (i <= j) {
            char getAti = str.charAt(i);
            char getAtj = str.charAt(j);
            if (!(getAti >= 'a' && getAti <= 'z'))
                i++;
            else if (!(getAtj >= 'a' && getAtj <= 'z'))
                j--;
            else if (getAti == getAtj) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    private static boolean PalindromeStackandQueue(String str) {
        str = str.toLowerCase();
        Queue<Character> q = new LinkedList<Character>();
        Stack<Character> s = new Stack<Character>();
        Character letter;
        int i;
        for (i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            if (Character.isLetter(letter)) {
                q.add(letter);
                s.push(letter);
            }
        }
        while (!q.isEmpty()) {
            if (q.remove() != s.pop())
                return false;
        }
        return true;
    }

    public static boolean PalindromeDeque(String str) {
        str = str.toLowerCase();
        Deque deque = new ArrayDeque();
        boolean palindrome = true;
        int count = 0;
        boolean frontString;
        boolean backString;
        if (count % 2 == 0) {
            while ((!deque.isEmpty()) && (palindrome)) {
                frontString = deque.removeFirstOccurrence(str);
                backString = deque.removeLastOccurrence(str);
                if (frontString == backString) {
                    palindrome = false;
                }
            }
        } else {
            int index = 0;
            while ((index < ((count - 1) / 2)) && (palindrome)) {
                frontString = deque.removeFirstOccurrence(str);
                backString = deque.removeLastOccurrence(str);
                if (!frontString == backString) {
                    palindrome = false;
                }
                index++;
            }
        }
        return true;
    }
}



