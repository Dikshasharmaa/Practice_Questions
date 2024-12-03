package org;
import java.util.Scanner;

public class Array1 {

    public void linearSearch(){
        // Linear Search
        // Take an array as input from user
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of your array");
       int size = sc.nextInt();
       int [] numbers = new int[size];

       for(int i =0; i<size; i++){
           numbers [i] = sc.nextInt();
       }

       //Search for give number x
       System.out.println("Enter the number you want to search");
       int x = sc.nextInt();
       //print the index at which it occurs.
       for(int j =0; j<size; j++){
           if(numbers[j] == x){
               System.out.println(j);
           }
       }

    }

}
