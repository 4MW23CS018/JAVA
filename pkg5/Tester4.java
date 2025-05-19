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
public class Tester4 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc1.nextInt();
        int sqr = n*n;
        int temp = sqr;
        int sum=0;
        int b=0;
        while(temp!=0){
             b = temp%10;
            temp/=10;
            sum += b;
        }
        
        System.out.println(n==sum?"Neon no":"Not a neon no");
    }
}
