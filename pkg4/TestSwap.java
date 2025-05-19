/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author user
 */
public class TestSwap {
    public static void main(String[] args) {
        
        int a=2;
        int b=4;
        int c;
        System.out.println("Before swapping: a="+a+" b="+b);

        c=a;
        a=b;
        b=c;
        System.out.println("After swapping: a="+a+" b="+b);
        
    }
}
