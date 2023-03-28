import java.util.Scanner;

public class No24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if (a1 > c) {
            System.out.print(0);
            return;
        }

        if ((a1 * n0 + a0) <= c * n0)
            System.out.print(1);
        else
            System.out.print(0);
    }
}