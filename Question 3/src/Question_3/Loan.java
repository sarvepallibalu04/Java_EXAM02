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
 class Loan
{
 double amount;
 Loan(double amt)
 {
  this.amount=amt;
 }
 @Override
 public String toString()
 {
  return "Loan with Amount "+this.amount;
 }
}


