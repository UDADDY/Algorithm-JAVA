import java.util.Scanner;

public class No9507 {

    public static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        dp = new long[68];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 68; i++)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];

        while (T-- > 0) {
            int input = sc.nextInt();
            System.out.println(dp[input]);
        }
    }
}