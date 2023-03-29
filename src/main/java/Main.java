import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;

        for (int i = A; i <= B; i++) {
            if (isUnderPrime(i))
                sum++;
        }

        System.out.println(sum);
    }

    public static boolean isUnderPrime(int num) {

        List<Integer> factors = new ArrayList<>();

        int temp = num;

        for (int i = 2; i <= Math.sqrt(temp); i++) {
            while (num % i == 0) {
                factors.add(i);
                num = num / i;
            }
        }

        if (isPrime(factors.size()))
            return true;

        return false;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}