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
public class Car {
    	private String CarModel;
	private String CarName;
	private float CarPrice;
	public Car(String CarModel, String CarName, float CarPrice) {
		this.CarModel = CarModel;
		this.CarName = CarName;
		this.CarPrice = CarPrice;
	}
	public Car() {}
	public void display()
	{
		System.out.println("Car Model: "+CarModel);
		System.out.println("Car Name : "+CarName);
		System.out.println("Car Price : "+CarPrice);
	}
}
