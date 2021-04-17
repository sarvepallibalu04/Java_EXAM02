/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_3;

/**
 *
 * @author Balaji Sarvepalli
 */
class Circle{
 double radius;
 Circle(double r)
 {
  this.radius=r;
 }
 @Override
 public String toString()
 {
  return "Circle with Radius "+this.radius;
 }
}