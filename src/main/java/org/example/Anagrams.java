package org.example;

import java.util.Arrays;

public class Anagrams {
    //Checking if two Strings are anagrams
    

    public void anagram(){
        String str1 = "listen";
        String str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }

        
    }
    
}
