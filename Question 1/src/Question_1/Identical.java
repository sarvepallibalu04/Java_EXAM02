/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

import java.util.Scanner;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Identical {
public static void removeDuplicate(int arr[]) {

    // TODO Auto-generated method stub
    int num = 10;
    System.out.print("The distinct integers are: ");
    for( int i=0;i<num;i++){
        int j;
        for(j=0;j<i;j++)
            if(arr[i] == arr[j])
                break;
        if(i == j)
            System.out.print(arr[i] +" ");
            
    }
        
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    System.out.println("Solution for Question 1 : Balaji Sarvepalli");
    System.out.print("Enter Ten integers: ");
    for( int i=0;i<10;i++)
        arr[i] = sc.nextInt();
    removeDuplicate(arr);
    
}
}