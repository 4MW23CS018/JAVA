/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author user
 */
public class Test_Switch {
    public static void main(String[] args) {
        int choice =2;
        switch(choice){
            case 1:
                System.out.println("You ordered Espresso");
                break;
            case 2:
                System.out.println("You ordered Cappuccino");
                break;
            case 3:
                System.out.println("You ordered Latte");
                break;
            default:
                System.out.println("Invalid choice");
                      
        }
    }
}
