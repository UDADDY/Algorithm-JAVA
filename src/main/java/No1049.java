import java.util.Scanner;

public class No1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int packageMin = 1000;
        int sigleMin = 1000;

        for (int i = 0; i < M; i++) {
            int packagePrice = sc.nextInt();
            int siglePrice = sc.nextInt();

            if (packagePrice < packageMin)
                packageMin = packagePrice;
            if (siglePrice < sigleMin)
                sigleMin = siglePrice;
        }

        if (sigleMin == 0) {
            System.out.println(0);
            return;
        }
        int criteria = packageMin / sigleMin; // 여기까지는 sigle이 좋다

        if (criteria >= 6) {
            System.out.println(N * sigleMin);
            return;
        }

        int a = N / 6;
        int b = N % 6;

        if (criteria >= b) {
            System.out.println(a * packageMin + b * sigleMin);
        } else {
            if (b > 0) {
                System.out.println(a * packageMin + packageMin);
            } else {
                System.out.println(a * packageMin);
            }
        }

    }
}