import java.util.Scanner;

public class No1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        boolean[][] board = new boolean[N][M];
        boolean[] rowGuarded = new boolean[N];
        boolean[] columnGuarded = new boolean[M];


        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '.') {
                    board[i][j] = false;
                } else {
                    board[i][j] = true;
                    rowGuarded[i] = true;
                    columnGuarded[j] = true;
                }
            }
        }

        int rowNotGuardedCnt = 0;
        int columnNotGuardedCnt = 0;

        for (int i = 0; i < N; i++) {
            if (!rowGuarded[i])
                rowNotGuardedCnt++;
        }


        for (int i = 0; i < M; i++) {
            if (!columnGuarded[i])
                columnNotGuardedCnt++;
        }

        if (rowNotGuardedCnt > columnNotGuardedCnt)
            System.out.println(rowNotGuardedCnt);
        else
            System.out.println(columnNotGuardedCnt);


    }

}