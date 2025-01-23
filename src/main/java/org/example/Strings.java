package org.example;

public class Strings {

    public void StringReverse(){
        //Reversing a String
        String str = "Interview";
        String reversed = "";
        StringBuilder sb = new StringBuilder(str);

        for(int i =str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
            
        }
        System.out.println(reversed);


    }
}
