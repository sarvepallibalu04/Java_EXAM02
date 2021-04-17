/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_8;

/**
 *
 * @author Balaji Sarvepalli
 */

public class NewMobile extends Mobile {

    public NewMobile(String Brand, String Cost, double Color) {
        super(Brand, Cost, Color);
    }
    @Override
    public void BrandOfMobile()
    {
        System.out.println("The new Mobile Brand is LG");
    } 
    public void Cost() { 
        System.out.print("Cost of the Mobile is : ");
        System.out.println(super.getBrand());
    }
    public void Color(){
        System.out.print("Color of the Mobile is : ");
        System.out.println(super.getCost());  
    }  
  
    }

