/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
}
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Duck extends Animal implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck is  flying");
    }
    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
}
public class Interface {
    public static void main(String[] args){
        Duck myDuck = new Duck();
        myDuck.eat();
        myDuck.fly();
        myDuck.swim();
    }
}
