import java.util.Scanner;

public class No5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        for (A = sc.nextInt(), B = sc.nextInt(); A != 0 && B != 0; A = sc.nextInt(), B = sc.nextInt()) {
            if (A < B) {
                if (B % A == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            } else {
                if (A % B == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            }
        }
    }
}