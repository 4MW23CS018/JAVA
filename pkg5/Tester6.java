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
public class Tester6 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter a number");
        int n=  sc1.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
    
}
