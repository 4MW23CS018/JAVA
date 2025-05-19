/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tester5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the base value");
        int base =  sc1.nextInt();
        System.out.println("Enter the exponent value");
        int exp = sc1.nextInt();
        int power=base;
        for(int i=1;i<exp;i++){
            power*= base;
        }
        System.out.println("Power is "+power);
    }
}
