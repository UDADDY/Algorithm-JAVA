package DataStructure;

public class ArrayStack {
    int cur; // Top Index
    int size; // Size of Stack
    int[] stack;

    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        cur = 0;
    }

    public void push(int data) {
        if (full())
            return;
        stack[cur] = data;
        cur++;
    }

    public int pop() {
        if (empty())
            return -1;

        cur--;
        int ret = stack[cur];
        stack[cur] = 0;
        return ret;
    }

    public boolean empty() {
        if (cur == 0)
            return true;
        return false;
    }

    public boolean full() {
        if (cur == size)
            return true;
        return false;
    }
}
