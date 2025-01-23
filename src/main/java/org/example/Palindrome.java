package org.example;

public class Palindrome {
    //check if the string is a palindrome or not
     public void pailndrome(){
        String str = "madam";
        String reverse = "";
        StringBuilder sb = new StringBuilder(str);
        reverse = sb.reverse().toString();

        if(str.equals(reverse)){
            System.out.println("the string is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
     }
    
}
