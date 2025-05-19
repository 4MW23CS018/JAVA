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
public class Tester7 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter end valuee");
        int endValue = sc1.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series of "+endValue);
        System.out.print(a+","+b);
        
        for(int i=2;i<endValue;i++){
            int sum=a+b;
            System.out.print(","+sum);
            a=b;
            b=sum;
        }
        }
        
    }

