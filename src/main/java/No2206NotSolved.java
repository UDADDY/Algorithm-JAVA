import java.util.LinkedList;
import java.util.Scanner;

public class No2206NotSolved {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int height;
    static int width;
    static int[][] map;
    static boolean[][] isVisited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        height = Integer.parseInt(str.split(" ")[0]);
        width = Integer.parseInt(str.split(" ")[1]);

        map = new int[height][width];
        isVisited = new boolean[height][width];

        // 입력
        for (int i = 0; i < height; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < width; j++)
                map[i][j] = input.charAt(j) - '0';
        }

        // 0, 1 뒤집기 -> 0이면 벽, 1이면 길
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] == 1)
                    map[i][j] = 0;
                else
                    map[i][j] = 1;
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));
        isVisited[0][0] = true;

        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            int x = curNode.x;
            int y = curNode.y;

            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX < 0 || nextX >= height || nextY < 0 || nextY >= width)
                    continue;
                if (isVisited[nextX][nextY])
                    continue;
                if (map[nextX][nextY] == 0) { // 벽이면
                    if (curNode.breakable) {
                        queue.offer(new Node(nextX, nextY, false));
                    }
                    continue;
                }

                queue.offer(new Node(nextX, nextY, curNode.breakable));
                map[nextX][nextY] = map[x][y] + 1;
                isVisited[nextX][nextY] = true;
            }

        }

        if (height == 1 && width == 1)
            return 1;
        if (map[height - 1][width - 1] == 1)
            return -1;
        else
            return map[height - 1][width - 1] + 2;

    }

    static class Node {
        public int x;
        public int y;
        public boolean breakable;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
            this.breakable = true;
        }

        public Node(int x, int y, boolean breakable) {
            this.x = x;
            this.y = y;
            this.breakable = breakable;
        }
    }
}