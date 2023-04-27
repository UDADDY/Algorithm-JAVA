package DataStructure;

public class ArrayQueue {

    static final int MAX = 1000;
    int[] arr;
    int rear; // For Insert
    int front; // For Remove
    int size;

    public ArrayQueue() {
        arr = new int[MAX];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int data) {
        rear++;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (empty()) {
            return -1;
        }
        front++;
        int ret = arr[front];
        size--;

        return ret;

    }

    public boolean empty() {
        if (front == rear)
            return true;
        return false;
    }

    public int size() {
        return rear - front;
    }


}
