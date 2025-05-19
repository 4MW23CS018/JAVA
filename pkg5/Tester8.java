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
public class Tester8 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc1.nextInt();
        int[] a = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)
            a[i] = sc1.nextInt();
        System.out.println("The following Array");
        for(int z:a)
            System.out.println(" "+z);
    }
}
