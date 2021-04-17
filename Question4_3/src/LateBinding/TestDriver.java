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
public class TestDriver {

public static void main(String... args){
    System.out.println("Question 4-3 : Balaji Sarvepalli");
    SuperType superType = new SuperType();
    superType.sayHello(); 
    superType = new SubType();
    superType.sayHello(); 
    superType.sayBye(); 
}
}

