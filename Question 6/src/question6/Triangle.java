/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Balaji Sarvepalli
 */
    public class Triangle extends GeometricObject {
        private double Side01;
        private double Side02;
        private double Side03;

    public Triangle(boolean isFilled, String Color, double Side01, double Side02, double Side03) {
        super(isFilled, Color);
        this.Side01 = Side01;
        this.Side02 = Side02;
        this.Side03 = Side03;
    }

        @Override
    public double getPerimeter() {
        return ((this.Side01 + this.Side02 + this.Side03));

    }

        @Override
    public double getArea() {
        double d = this.getPerimeter();
        return (Math.sqrt((d - this.Side01) * (d - this.Side02) * (d - this.Side03) * d));
    }

        @Override
    public String toString() {
        return "Area: " + this.getArea() +"\nPerimeter: " + this.getPerimeter() +"\nColor:" + this.getColor() +"\nFilled: " + this.isIsFilled();
    }
}


    

