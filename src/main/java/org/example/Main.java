package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.Array1;

public class Main {
    public static void main(String[] args) {
        // Array1 arr = new Array1();
        // arr.linearSearch();

        // Array2 arr2 = new Array2();
        // arr2.multiDimension();

        // Strings string = new Strings();
        // string.StringReverse();

        commonString str = new commonString();
        String result = str.longestSubstring("abcdef", "zabxcdef");
        System.out.println(result);

        Collections linkedL = new Collections();
        linkedL.LinkList();

        
    }
}