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
public class Tester3 {
    public static void main(String[] args) {
       Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc1.nextInt();
        System.out.println(num%10==7 || num%7==0?"Buzz no":"Not a buzz no");
    }
}
