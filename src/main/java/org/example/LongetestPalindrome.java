package org.example;

public class LongetestPalindrome {
    // Find longest substring which is palindromic
    String str= "babad";
    String result = "";
    String output = "";



//Write a method to find palindrome
public boolean isPalindrome(String s){
    StringBuilder sb = new StringBuilder(s);
    result = sb.reverse().toString();
    return s.equals(result);

}

//longest substring
public void longestString(){
     //iterate through the string 
     for (int i =0; i<str.length(); i++){
        for(int j =i; j<str.length(); j++){
            String sub = str.substring(i, j+1);
            if(isPalindrome(sub) && sub.length()> output.length()){
                output = sub;
            }
        }
     }
     System.out.println(output);
}
    
}
