import java.util.Scanner;

public class No1817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maxWeight = sc.nextInt();
        int boxCount = 1;

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int boxCapacity = maxWeight;
        for (int i = 0; i < N; i++) {
            int bookWeight = sc.nextInt();
            boxCapacity -= bookWeight;
            if (boxCapacity == 0) {
//                boxCapacity = maxWeight;
//                boxCount++;
            } else if (boxCapacity < 0) {
                boxCapacity = maxWeight;
                boxCapacity -= bookWeight;
                boxCount++;
            }
        }

        System.out.println(boxCount);
    }
}