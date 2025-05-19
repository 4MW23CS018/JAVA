/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numprob;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc1 =  new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc1.nextInt();
        int prd=1;
        while(a!=0){
            int d = a%10;
            prd*=d;
            a/=10;
        }
        System.out.println(prd);
        }
    }

