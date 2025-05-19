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
public class Tester9 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc1.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements");
        int sum=0;
        for(int i = 0;i<n;i++){
            a[i]=sc1.nextInt();
            sum+=a[i];
            
        }
        System.out.println("Sum: "+sum);
    }
}
