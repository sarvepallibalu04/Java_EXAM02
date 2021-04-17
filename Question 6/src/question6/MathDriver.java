/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Balaji Sarvepalli
 */
public class MathDriver {
/*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 6 : Balaji Sarvepalli");
        System.out.print("Enter the side01 : ");
        double Side01 = scan.nextDouble();
        System.out.print("Enter the side02 : ");
        double Side02 = scan.nextDouble();
        System.out.print("Enter the side03 : ");
        double Side03 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the color : ");
        String S = scan.nextLine();
        System.out.print("Is the triangle is filled with color? " + " (True or False): ");
        boolean isFilled = scan.nextBoolean();
        Triangle T = new Triangle(isFilled, S, Side01, Side02, Side03);
        System.out.println(T.toString());
    }
}

