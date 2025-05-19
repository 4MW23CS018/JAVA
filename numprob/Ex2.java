/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprob;
import java.util.Scanner;



public class Ex2 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter a number");
        int x  = sc1.nextInt();
        while(x!=0){
            int digit = x%10;
            System.out.print(digit+" ");
            x/=10;
        }
    }
}
