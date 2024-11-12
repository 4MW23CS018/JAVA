/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
class Animal1{
    void eat(){
        System.out.println("Animal eats food");
    }
    
}
class Mammal extends Animal1{
    void breathe(){
        System.out.println("Mammal breathes air.");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
/**
 *
 * @author smv
 */
public class MultiLevel {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.breathe();
        myDog.bark();
    }
}
