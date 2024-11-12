/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
class Outer{
    void display(){
        System.out.println("This is an Outer class");
    }
    static class Inner{
        void display(){
            System.out.println("This is an Inner class which is inside Outer class");
        }
}
        
}

/**
 *
 * @author smv
 */
public class TestNested {
    public static void main(String[] args){
        Outer o1 = new Outer();
        Outer.Inner i1 = new Outer.Inner();
        o1.display();
        i1.display();
    }    
}
