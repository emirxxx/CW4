package com.swips.right_rotate_array;

import java.util.Scanner;

public class App {
    
    public static void main(String args[]) {
      
        Scanner s = new Scanner(System.in);
        // array input
        String input = s.nextLine();
        // n determines the number of times an array should be rotated
        int n = s.nextInt();    
        
        // convert array of strings to array of integers
        String[] strArr = input.split(" ");
        int[] intArr = new int[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        // modular arithmetic optimization
        n = n % intArr.length;
        
        // display original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < intArr.length; i++) {     
            System.out.print(intArr[i] + " ");     
        }      
            
        // rotate the given array by n times toward right    
        for (int i = 0; i < n; i++) {    
            int j; 
            int last;    
            // store the last element of array    
            last = intArr[intArr.length - 1];    
            
            for (j = intArr.length - 1; j > 0; j--) {    
                //Shift element of array by one    
                intArr[j] = intArr[j - 1];    
            }    
            // last element of array will be added to the start of array.    
            intArr[0] = last;    
        }    
        
        System.out.println();    
            
        // display resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i < intArr.length; i++) {    
            System.out.print(intArr[i] + " ");    
        }   
    }
}
