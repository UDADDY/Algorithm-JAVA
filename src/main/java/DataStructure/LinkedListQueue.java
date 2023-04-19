package DataStructure;

public class LinkedListQueue<E> {
    LinkedListQueueNode<E> front;
    LinkedListQueueNode<E> rear;
    int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(E item) {
        LinkedListQueueNode<E> newNode = new LinkedListQueueNode<E>(item);

        if (size == 0)
            front = newNode;
        else
            rear.nextNode = newNode;
        rear = newNode;
        size++;
    }

    public E dequeue() {
        if (size == 0)
            return null;

        LinkedListQueueNode<E> temp = front.nextNode;
        E ret = front.item;
        front.item = null;
        front.nextNode = null;
        front = temp;
        size--;

        return ret;
    }
}

class LinkedListQueueNode<E> {
    E item;
    LinkedListQueueNode<E> nextNode;

    public LinkedListQueueNode() {
        nextNode = null;
    }


    public LinkedListQueueNode(E item) {
        this.item = item;
        nextNode = null;
    }

}
