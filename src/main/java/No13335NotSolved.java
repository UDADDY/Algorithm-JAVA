import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No13335NotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfTrucks = sc.nextInt();
        int lenOfBridge = sc.nextInt();
        int maxWeight = sc.nextInt();

        Queue<Integer> arrOfTrucks = new LinkedList<>();
        int[] arrOfBridge = new int[lenOfBridge];
        for (int i = 0; i < numOfTrucks; i++)
            arrOfTrucks.add(sc.nextInt());

        int cur = 0;
        int bridgeCur = 0;

        while (true) {
//            arrOfTrucks.poll();
//            arrOfBridge[bridgeCur]
        }
    }
}