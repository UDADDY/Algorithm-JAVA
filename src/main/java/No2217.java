import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[] ropes = new Integer[N];

        for (int i = 0; i < N; i++)
            ropes[i] = sc.nextInt();
        Arrays.sort(ropes, Collections.reverseOrder());

        int max = 0;

        for (int i = 0; i < N; i++) {
            max = Math.max(max, ropes[i] * (i + 1));
        }

        System.out.println(max);


    }
}

/*
    6 5 4 3 2 1

    6 - 6
    6 5 - 10
    6 5 4 - 12
    6 5 4 3 - 12
    6 5 4 3 2 - 10
 */