/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;
class Box{
    int len,wid,hgh;
    static int nfaces=6;
    void box(int len, int wid,int hgh){
        System.out.println("length="+len);
        System.out.println("Width="+wid);
        System.out.println("height="+hgh);
        System.out.println("no of Faces="+nfaces);
    }
        
}
public class TestStatic {
    public static void main(String[] args){
        Box b= new Box();
        b.box(2,3,5);
        b.box(2, 6, 9);
        
    }
}
