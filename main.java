class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

class linkedlist {
    node head, tail;

    public void insert(int data) {
        node n = new node(data);
        n.next = null;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class main {
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
    }
}
