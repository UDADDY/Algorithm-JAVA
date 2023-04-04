import java.util.Scanner;

public class No1812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] answer = new int[N];
        int[] candy = new int[N];

        int max = 0;

        for (int i = 0; i < N; i++)
            answer[i] = sc.nextInt();

        for (int i = 0; i <= answer[0]; i++) {
            candy[0] = i;
            for (int j = 1; j < N; j++) {
                candy[j] = answer[j - 1] - candy[j - 1];
            }
            if (candy[0] + candy[N - 1] == answer[N - 1])
                break;
        }

        for (int i = 0; i < N; i++)
            System.out.println(candy[i]);

    }
}