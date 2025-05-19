/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprob;
import java.util.Scanner;



public class Ex5 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter a number");
        int x  = sc1.nextInt();
        int y = x;
        int rev=0;
        while(y!=0){
            int digit = y%10;
            rev = rev*10 + digit;
            y/=10;
        }
        System.out.println(x==rev?"Palindrome":"Not a Palindrome");
        
    }
}
