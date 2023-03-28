import java.util.Scanner;

public class No1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[][] area = new int[N][M];

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < M; j++) {
                area[i][j] = input.charAt(j) - '0';
            }
        }

        int maxArea = 1;
        for (int number = 0; number <= 9; number++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (area[i][j] == number) {
                        for (int garo = j + 1; garo < M; garo++) {
                            if (area[i][garo] == number) {
                                int gap = garo - j;
                                if (i + gap >= N) {
                                    continue;
                                }

                                if (area[i + gap][j] == number && area[i + gap][garo] == number) {
                                    int gapArea = (gap + 1) * (gap + 1);
                                    if (gapArea > maxArea)
                                        maxArea = gapArea;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxArea);
    }
}