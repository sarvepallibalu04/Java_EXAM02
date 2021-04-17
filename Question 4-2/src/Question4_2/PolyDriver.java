/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4_2;

/**
 *
 * @author Balaji Sarvepalli
 */
public class PolyDriver {

    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
                System.out.println("Question 4-2 : Balaji Sarvepalli");
		Car C1 = new Car("SUV","Tayota",500000);
		C1.display();
		Car C2 = new AdvancedModel("BMW","Koloes",800000,100000);
		C2.display();
                Car C3 = new AdvancedModel("Audui","Kia",900000,25000);
		C3.display();         
	}

}



