import java.util.Scanner;

public class No13305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number Of Country

        long[] lengthOfBridge = new long[N - 1];
        for (int i = 0; i < N - 1; i++)
            lengthOfBridge[i] = sc.nextLong();

        long[] priceOfOil = new long[N];
        for (int i = 0; i < N; i++)
            priceOfOil[i] = sc.nextLong();

        long sumOfOil = 0;

        for (int i = 0; i < N && i != N - 1; ) {
            int nextIdx = i + 1;
            while (true) {
                if (nextIdx >= N) {
                    nextIdx--;
                    break;
                }
                if (priceOfOil[i] > priceOfOil[nextIdx])
                    break;
                nextIdx++;
            }

            int sumOfLegnth = 0;
            for (int j = i; j < nextIdx; j++)
                sumOfLegnth += lengthOfBridge[j];
            sumOfOil += sumOfLegnth * priceOfOil[i];

            i = nextIdx;
        }

        System.out.println(sumOfOil);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt(); // Number Of Country
//
//        int[] lengthOfBridge = new int[N - 1];
//        for (int i = 0; i < N - 1; i++)
//            lengthOfBridge[i] = sc.nextInt();
//
//        int[] priceOfOil = new int[N];
//        for (int i = 0; i < N; i++)
//            priceOfOil[i] = sc.nextInt();
//
//        long sumOfOil = 0;
//
//        for (int i = 0; i < N - 1; ) {
//            int nextIdx = i + 1;
//            while (priceOfOil[i] < priceOfOil[nextIdx] && nextIdx < N - 1)
//                nextIdx++;
//
//            int sumOfLength = 0;
//            for (int j = i; j < nextIdx; j++)
//                sumOfLength += lengthOfBridge[j];
//
//            sumOfOil += priceOfOil[i] * sumOfLength;
//            i = nextIdx;
//        }
//
//        System.out.println(sumOfOil);
//
//    }
}