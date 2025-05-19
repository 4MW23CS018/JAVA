/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TestScanner {
    
    public static void main(String[] args){
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a =sc1.nextInt();
        System.out.println("Enter the second value");
        int b=sc1.nextInt();
        int sum= a+b;
        System.out.println("Sum of two numbers: "+sum);
    }
}
