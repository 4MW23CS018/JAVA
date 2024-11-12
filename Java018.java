/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
class OverloadDemo{
    void test(){
        int sum=0;
        System.out.println(sum);
    }
    void test(int a,int b){
        int sum =a+b;
        System.out.println(sum);
        
    }
    void test(double a,double b){
        double sum=a+b;
        System.out.println(sum);
    }
}
public class Java018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OverloadDemo o1= new OverloadDemo();
        o1.test();
        o1.test(2,3);
        o1.test(2.3,3.4);
    }
    
}
