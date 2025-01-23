package org.example;

public class VowelsConstants {
    // program to count vowels and constants
    String str = "Java program";
    char[]arr = str.toLowerCase().toCharArray();
    int vowels =0;
    int constants = 0;
    public void check(){
        for(char c : arr){
            if("aieou".indexOf(c) != -1){
                vowels++;
            }
            else if(c> 'a'&& c < 'z'){
                constants++;

            }
            
               
                

            
            
        }
        System.out.println("Vowels"+ vowels);
        System.out.println("constants"+ constants);
    

    }
    
}
