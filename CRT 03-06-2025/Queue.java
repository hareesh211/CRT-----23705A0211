public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        int val = q.dequeue();
        System.out.println("Removed value: " + val);

        q.print();
        System.out.println("Length of Queue: " + q.length());
    }
}

class Queue {
    private Node head;
    private Node rear;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.head = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        if (head == null) {
            rear = null;  
        }
        return val;
    }

    public int length() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void print() {
        Node temp = head;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
