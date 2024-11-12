/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

class Factorial{
    int fact(int n){
        int result;
        if(n<=1)
            return 1;
        result = fact(n-1)*n;
        return result;
    }
}
public class fact {
    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println(f.fact(3));
        System.out.println(f.fact(4));
        System.out.println(f.fact(5));
    }
}
