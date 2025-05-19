/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

public class TestInherit extends A {

    int m = 56;

    public static void main(String[] args) {
        TestInherit z = new TestInherit();
        System.out.println(z.m);
        System.out.println(A.done(5, 10));
        System.out.println(z.x);
        System.out.println("Your name is "+A.name("Ashish"));
    }

}
