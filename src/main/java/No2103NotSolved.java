import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2103NotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Point> list = new ArrayList<>();

        // Input
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list.add(new Point(x, y));
        }

        List<List<Point>> overlappedX = new ArrayList<>();
        List<List<Point>> overlappedY = new ArrayList<>();

        // Finding The Number Of Overlapping x, y
        for (int i = 0; i < list.size(); i++) {
            List<Point> tmp = new ArrayList<>();
            overlappedX.add(tmp);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    tmp.add(list.get(j));
                    list.remove(j);
                }
            }
        }


    }

}

class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}