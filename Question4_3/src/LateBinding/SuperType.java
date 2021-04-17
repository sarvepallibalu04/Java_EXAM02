package LateBinding;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balaji Sarvepalli
 */
   public class SuperType {
    
public void sayHello(){
System.out.println("Hello from SuperType");
}
public void sayBye(){
System.out.println("Bye from SuperType");
}
}
class SubType extends SuperType {
// override the superclass method
@Override
public void sayHello(){
System.out.println("Hello from SubType");
}
}

