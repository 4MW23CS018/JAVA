/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author user
 */
class Runner {
    public static void main(String[] args) {
        BankImp b=new BankImp();
        System.out.println("the total balance is"+b.depositing(10000));
        System.out.println("the remaining balance is"+b.withdrawing(1000));
    }
}
