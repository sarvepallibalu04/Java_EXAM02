/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Balaji Sarvepalli
 */
public class Stationaries implements Pens {
  public void Pens() {
      System.out.println("Question 9 : Balaji Sarvepalli ");
    System.out.println("Pens");
  }
  public void Pencils() {
    System.out.println("Pencils");
  }
}

class Main {
  public static void main(String[] args) {
    Stationaries s = new Stationaries ();
    s.Pens();
    s.Pencils();
  }
}
