import java.util.Scanner;

public class No2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] dp = new long[91];
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= N; i++)
            dp[i] = dp[i - 2] + dp[i - 1];

        System.out.println(dp[N]);
    }
}