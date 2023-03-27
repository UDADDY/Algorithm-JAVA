import java.util.Scanner;

public class No2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int maxIdxX = 0;
        int maxIdxY = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > arr[maxIdxX][maxIdxY]) {
                    maxIdxX = i;
                    maxIdxY = j;
                }
            }
        }

        System.out.println(arr[maxIdxX][maxIdxY]);
        System.out.println(maxIdxX + 1 + " " + (maxIdxY + 1));

    }

}
