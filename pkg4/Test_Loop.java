/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Test_Loop {
    public static void main(String[] args) {
        int sum=0;
        int[] a = new int[5];
        Scanner sc1= new  Scanner(System.in);
        System.out.println("Enter five values");
        for(int i=0;i<5;i++){    
            a[i]=sc1.nextInt();
        }
        System.out.println("Sum of these five values are");
        for(int i=0;i<5;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}