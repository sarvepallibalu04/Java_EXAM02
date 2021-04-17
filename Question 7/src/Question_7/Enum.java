/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_7;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Enum {

    /**
     * @param args the command line arguments
     */
       public static void main(String args[]){
        System.out.println("Question 7 : Balaji Sarvepalli");
	Sessions s = Sessions.Spring;  
	if(s == Sessions.Summer) {
	    System.out.println("Session: East");
	} else if(s == Sessions.Winter) {
	    System.out.println("Session: West");
	  } else if(s == Sessions.Spring) {
	      System.out.println("Session: Spring");
  	    } else {
		System.out.println("Session: Fall");
	      }
   }
}
