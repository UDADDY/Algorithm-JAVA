import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            sum += x * y;
        }

        if (total == sum)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}