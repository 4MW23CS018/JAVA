/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

class FoodApp{
    static void ddeliveryFood(){
        System.out.println("Welcome to Food Delivery App");
    }
}

class Swiggy extends FoodApp{
    
    static void ddeliveryFood(){
        System.out.println("delivering food from Swiggy");
    }
    
}
class Zomato extends FoodApp{
    
    static void ddeliveryFood(){
        System.out.println("Delivering Food from Zomato");
    }
}
public class Tester {
    public static void main(String[] args) {
        
        FoodApp.ddeliveryFood();
        
      
        Swiggy.ddeliveryFood();
        
        
        Zomato.ddeliveryFood();
    }
}
