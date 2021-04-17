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
public class AdvancedModel  extends Car {
   private double discount;

	public AdvancedModel(String CarModel, String CarName, float CarPrice, float discount) {
		super(CarModel, CarName, CarPrice);
		this.discount = discount;
	}
	public AdvancedModel() {}
   @Override
	public void display()
	{
		super.display();//invokes the Book class display()
		System.out.println("Discount : "+discount);
	}
}
