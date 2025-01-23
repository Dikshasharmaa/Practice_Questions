package org.example;

public class Search {
    public void age(){
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    // find the smallest or lowest 
    int lowestAge = ages[0];
    
    for(int i : ages){
        if(lowestAge > i){
            lowestAge = i;
        }
    }
    System.out.println(lowestAge);
}
}
