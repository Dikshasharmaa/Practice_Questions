package org.example;

public class Factorial {
    //Finding factorial of a number 
    
    
    public int fact(int number){
        if (number == 1){
            return 1;
        }
        else{
            return number * fact(number - 1);
        }
        
    }
}
