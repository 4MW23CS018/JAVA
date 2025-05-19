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
public class Test_NestedIf {
    public static void main(String[] args) {
        String username="Ashish";
        int password = 8747;
        
        if(username=="Ashish"){  
            if(password==8747){
                System.out.println("Hello!, welome...");
               
            }
            else{
                System.out.println("Incorrect Password");
            }
        }
        else{
            System.out.println("Invalid Username");
        }
    }
}
