import java.util.Scanner;

public class No2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int N = Integer.parseInt(sc.nextLine());

        boolean[][] area = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = y; j < y + 10; j++) {
                for (int z = x; z < x + 10; z++) {
                    if (!area[j][z]) total++;
                    area[j][z] = true;
                }
            }
        }

        System.out.print(total);
    }
}