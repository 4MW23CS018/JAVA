/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author user
 */
class Puppy extends Dog1{
    void canPlay(){
        System.out.println("Plays");
    }
}
public class TestInheritance{
    public static void main(String[] args) {
        Puppy p1 =  new Puppy();
        p1.canSwim();
        p1.canPlay();
        p1.sound();
    }
}