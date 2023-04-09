import java.util.Arrays;
import java.util.Scanner;

// 직교다각형
public class No2103NotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arr = new long[N];


        for (int i = 0; i < N; i++)
            arr[i] = sc.nextLong();
        Arrays.sort(arr);

        long denominator = arr[0];
        for (int i = 1; i < N; i++) {
            denominator = lcm(denominator, arr[i]);
        }

        int numerator = 0;
        for (int i = 0; i < N; i++) {
            numerator += denominator / arr[i];
        }

        long gcd = gcd(denominator, numerator);

        System.out.println(denominator / gcd + "/" + numerator / gcd);

    }

    public static long gcd(long a, long b) {
        long c;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static long lcm(long a, long b) {

        return a * b / gcd(a, b);
    }

}