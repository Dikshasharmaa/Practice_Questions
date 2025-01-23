package org.example;

import java.util.HashMap;

public class CountCharacters {
    // count the frequency of each charcter 

    public void count(){
        String str = "hello world";
        HashMap<Character, Integer> frequency = new HashMap<>();
        // make an array 
        char[] arr = str.toCharArray();
        // loop through the string 
        for(char c : arr){
            if(frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)+1);
            }
            else{
                frequency.put(c, 1);
            }
            
        }
        System.out.println(frequency);

    }
    
}
