import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int height = sc.nextInt();

        boolean[][] isVisited = new boolean[height][width];
        int[][] board = new int[height][width];

        for (int i = 0; i < height; i++) {
            String str = sc.nextLine();

            for (int j = 0; j < width; j++) {
                if (str.charAt(j) == 'W') // W면 0
                    board[i][j] = 0;
                else  // B면 1
                    board[i][j] = 1;
            }
        }

        LinkedList<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        isVisited[0][0] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            if (isVisited[cur.i][cur.j])
                continue;

            
        }
    }

    static class Point {
        int i;
        int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}