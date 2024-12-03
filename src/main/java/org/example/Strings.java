package org.example;

public class Strings {

    public void StringReverse(){
        //Reversing a String
        StringBuilder sb = new StringBuilder("hello");

        for(int i =0; i<sb.length(); i++){
            sb.reverse();
            
        }
        System.out.println(sb);


    }
}
