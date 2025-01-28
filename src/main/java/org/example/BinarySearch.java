package org.example;

public class BinarySearch {
    public void search(int x){
        int []arr = {1,2,3,4,5};
        int low =0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==x){
                System.out.println(mid);
                break;
            }
            else if (arr[mid]<x){
                low = mid +1;
            }
            else if (arr[mid]> x){
                high = mid -1;
            }

        }

        
    }
    
}
