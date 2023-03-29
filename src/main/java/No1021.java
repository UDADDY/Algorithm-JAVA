import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] search = new int[M];

        for (int i = 0; i < M; i++)
            search[i] = sc.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++)
            deque.add(i + 1);

        int count = 0;
        for (int i = 0; i < M; i++) {

            int rightCount = right(deque.clone(), search[i]);
            int backCount = back(deque.clone(), search[i]);
            if (rightCount <= backCount) {
                count += right(deque, search[i]);
                for (int j = 0; j < right(deque, search[i]); j++) {
                    int head = deque.removeFirst();
                    deque.addLast(head);
                }
                deque.removeFirst();
            } else {
                count += back(deque, search[i]);
                for (int j = 0; j < back(deque, search[i]); j++) {
                    int back = deque.removeLast();
                    deque.addFirst(back);
                }
                deque.removeFirst();
            }
        }

        System.out.println(count);
    }

    public static int right(Deque<Integer> deque, int search) {
        int count = 0;
        while (true) {
            if (deque.getFirst() == search)
                return count;
            int head = deque.removeFirst();
            deque.addLast(head);
            count++;
        }
    }

    public static int back(Deque<Integer> deque, int search) {
        int count = 0;
        while (true) {
            if (deque.getFirst() == search)
                return count;
            int back = deque.removeLast();
            deque.addFirst(back);
            count++;
        }
    }

}