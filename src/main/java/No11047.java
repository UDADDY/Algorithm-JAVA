import java.util.Scanner;

public class No11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] values = new int[N];

        for (int i = 0; i < N; i++)
            values[i] = sc.nextInt();

        int i;
        for (i = 0; i < N; i++)
            if (values[i] > K)
                break;
        i--;

        int cnt = 0;
        while (K != 0) {
            if (values[i] > K) {
                i--;
                continue;
            }
            cnt += K / values[i];
            K = K % values[i];
            i--;
        }

        System.out.println(cnt);
    }
}