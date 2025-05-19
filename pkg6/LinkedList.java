/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;


public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int item){
            this.data=item;
            next = null;
        }
    }
    void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
        }
        else{
            Node temp =head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            }
        System.out.println("null");
    }
    void delete(int x){
        if(head==null){
            return;
            
        
        }
        if(head.data==x){
            head=head.next;
            return;
           
        }
        Node temp= head;
        while(temp.next!=null){
            if(temp.next.data ==x){
                temp.next = temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList l =new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
        l.delete(20);
        l.display();
        
        
    }
}
