import java.math.BigInteger;
import java.util.Scanner;

public class No1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int N = sc.nextInt();

            BigInteger sum = new BigInteger("0");
            for (int j = 0; j < N; j++) {
                long input = sc.nextLong();
                sum = sum.add(new BigInteger(String.valueOf(input)));
            }

            if (sum.toString().charAt(0) == '0')
                System.out.println("0");
            else if (sum.toString().charAt(0) == '-')
                System.out.println("-");
            else
                System.out.println("+");
        }

    }
}