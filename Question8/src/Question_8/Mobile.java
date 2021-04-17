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
public abstract class Mobile {
    private String Brand;
    private String Cost;
    private double Color;

    public Mobile(String Brand, String Cost, double Color) {
        this.Brand = Brand;
        this.Cost = Cost;
        this.Color = Color;
    }

   public void BrandOfMobile(){};

    public String getBrand() {
        return Brand;
    }

    public String getCost() {
        return Cost;
    }

    public double getColor() {
        return Color;
    }  
}
