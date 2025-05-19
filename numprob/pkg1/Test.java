/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
import pkg2.Add;
/**
 *
 * @author user
 */

public class Test{
       public static void main(String[] args){
           MethodOverloading m=new MethodOverloading();
           m.study(19,"John");
           m.study("John",19);
           Add n = new Add();
           n.add(4,5);
       }
}