/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

abstract class  Calculator{
    abstract void  add(int x , int y);
    abstract void mul(int x, int y);
}

class CalculatorImp extends Calculator{
    @Override
    void add(int x,int y){
        System.out.println(x+y);
    }
    @Override
    void mul(int x, int y){
        System.out.println(x*y);
    }
}
public class Tester1 {
    public static void main(String[] args) {
        
    
        CalculatorImp a =  new CalculatorImp();
        a.add(2,7);
        a.mul(3,4);
    }
}
