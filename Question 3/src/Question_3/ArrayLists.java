/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_3;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Balaji Sarvepalli
 */
public class ArrayLists {
 public static void main(String[] args) 
 {
  ArrayList<Object> arr_list = new ArrayList<Object>();
  arr_list.add(new Loan(5000.50));  
  arr_list.add(new Date());  
  arr_list.add(new String("String class")); 
  arr_list.add(new Circle(3.45)); 
  System.out.println("Question 3 : Balaji Sarvepalli");

  for (int i = 0; i < arr_list.size(); i++) 
  {
   System.out.println((arr_list.get(i)).toString());
  }
 }
}

