package pkg6;

public class Queue {

    int maxSize;
    int[] queueArray;
    int front;
    int rear;
    int value;
    Queue(int size) {
        this.maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        value=0;
    }

    void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queueArray[++rear] = value;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        else {
            int temp = queueArray[front++];
            if(front==maxSize){
                front=0;
            }value--;
            return temp;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front];
    }

    boolean isEmpty() {
        return front > rear;
    }

    int size() {
        return rear - front + 1;
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Size: " + q.size());
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
    }
}
