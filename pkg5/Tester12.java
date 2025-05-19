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
public class Tester12 {
    public static void main(String[] args) {
        int evenCount=0, oddCount=0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc1.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]= sc1.nextInt();
            
        }
        for(int x: a){
            if(x%2==0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Even count: "+evenCount+" Odd Count "+oddCount);
    }
}
