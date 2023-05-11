import java.util.Scanner;

public class No11066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int numOfPages = sc.nextInt();
            int pages[] = new int[numOfPages];

            for (int j = 0; j < numOfPages; j++)
                pages[j] = sc.nextInt();

            System.out.println(solution(pages));
        }
    }

    public static int min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }

    public static int sum(int[] pages, int s, int e) {
        int sum = 0;

        for (int i = s; i <= e; i++)
            sum += pages[i];

        return sum;
    }

    private static int solution(int[] pages) {
        int size = pages.length;
        int DP[][] = new int[size][size];    // i~j까지 최소합 DP
        int s[] = new int[size];    // SUM 저장

        // i 요소까지 총합
        s[0] = pages[0];
        for (int i = 1; i < size; i++)
            s[i] += s[i - 1] + pages[i];

        // 초기값 저장
        for (int i = 0; i < size - 1; i++)
            DP[i][i + 1] = pages[i] + pages[i + 1];

        for (int gap = 2; gap < size; gap++) {    // i와 j간 gap 2칸부터
            for (int i = 0; i + gap < size; i++) {    // i인덱스
                int j = i + gap;    // j 인덱스
                DP[i][j] = Integer.MAX_VALUE;    // MIN을 구하기 위해

                for (int k = i; k < j; k++)    // i~j 사이의 k값
                    DP[i][j] = min(DP[i][k] + DP[k + 1][j] + sum(pages, i, j), DP[i][j]);
            }
        }
        return DP[0][pages.length - 1];
    }
}