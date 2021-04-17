/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;

import java.util.Scanner;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Array {
	
	public static void main(String[] args) {
                System.out.println("Question 2 : Balaji Sarvepalli");
		System.out.print("Enter list1: ");
		int[][] list1 = getArray();
		System.out.print("Enter list2: ");
		int[][] list2 = getArray();

		System.out.println("The two arrays are" + 
			(equals(list1, list2) ? " " : " not ") + "strictly identical");
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}

	public static int[][] getArray() {
		Scanner input = new Scanner(System.in);
		int[][] m = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
			}
		}
		return m;
	}
}