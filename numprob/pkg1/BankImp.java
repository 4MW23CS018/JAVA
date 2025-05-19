
package pkg1;


 class BankImp extends Bank {
     int depositing(int a){
         int balance=5000;
         int update=balance+a;
         return update;
         
     }
     int withdrawing(int x){
         int balance=1000;
         int update=balance-x;
         return update;
         
     }
}
