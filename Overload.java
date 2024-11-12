/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
class OverloadDemo1{
    void test(){
        System.out.println("No parameter");
    }
    void test(int a){
        System.out.println("a:"+a);
    }
    void test(int a,int b ){
        System.out.println("a and b:"+a+" "+b);  
    }
    double test(double a){
        System.out.println("double a:"+a);
        return a*a;
    }
}
/**
 *
 * @author smv
 */
public class Overload {
    public static void main(String[] args){
        OverloadDemo1 n1= new OverloadDemo1();
        double result;
        n1.test();
        n1.test(10);
        n1.test(10,20);
        n1.test(5.5);
        
    }
    
}
