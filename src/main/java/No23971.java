import java.util.Scanner;

public class No23971 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        int heightCount = (int) Math.ceil((double) H / (N + 1));
        int widthCount = (int) Math.ceil((double) W / (M + 1));

        System.out.println(heightCount * widthCount);
    }
}