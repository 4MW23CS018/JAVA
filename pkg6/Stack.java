/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

public class Stack {

    int maxSize;
    int[] stackArray;
    int top;

    Stack(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stackArray[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top+1;
    }
       public static void main(String[] args) {
        Stack stk =  new Stack(3);
        stk.push(2);
        stk.push(3);
        stk.push(1);
        stk.push(10);
        System.out.println("Size:"+stk.size());
        System.out.println("Peek:"+stk.peek());
        System.out.println("Popped:"+stk.pop());
        System.out.println("Popped:"+stk.pop());
       System.out.println("Peek:"+stk.peek());
    }
}

