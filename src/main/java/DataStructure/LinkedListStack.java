package DataStructure;

public class LinkedListStack {

    Node head;

    public LinkedListStack() {
        head = new Node();
        head.nextNode = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (empty()) {
            head.nextNode = newNode;
            return;
        }

        newNode.nextNode = head.nextNode;
        head.nextNode = newNode;
        return;
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        Node retNode = head.nextNode;
        head.nextNode = retNode.nextNode;

        return retNode.getItem();
    }

    public boolean empty() {
        if (head.nextNode == null)
            return true;
        return false;
    }

}

class Node {
    int item;
    Node nextNode;

    Node() {
    }

    Node(int item) {
        this.item = item;
        nextNode = null;
    }

    public int getItem() {
        return item;
    }

    public Node nextNode() {
        return nextNode;
    }
}
