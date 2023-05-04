import java.util.Arrays;
import java.util.Scanner;

public class No11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] workTime = new int[N];

        for (int i = 0; i < N; i++)
            workTime[i] = sc.nextInt();

        Arrays.sort(workTime);

        int waitTime = 0;

        for (int i = 0; i <= N; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += workTime[j];
            }
            waitTime += sum;
        }

        System.out.println(waitTime);
    }
}

// 3 1 3 4 2
// 1 2 3 3 4
// 1 3 6 9 13