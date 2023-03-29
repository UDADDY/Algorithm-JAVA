import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int kim = sc.nextInt();
        int Lim = sc.nextInt();

        List<Integer> competitors = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (i == kim - 1 || i == Lim - 1) {
                competitors.add(2);
            } else
                competitors.add(1);
        }

        int count = 1;

        while (true) {
            // check
            for (int i = 0; i < competitors.size(); i += 2) {
                if (i == competitors.size() - 1) {
                    continue;
                }

                if (competitors.get(i) == 2 && competitors.get(i + 1) == 2) {
                    System.out.println(count);
                    return;
                }
            }

            // compete
            for (int i = 0; i < competitors.size(); i += 2) {
                if (i == competitors.size() - 1) {
                    continue;
                }
                if (competitors.get(i + 1) == 2) {
                    competitors.set(i, 0);
                } else {
                    competitors.set(i + 1, 0);
                }
            }

            competitors.removeIf(n -> (n == 0));

//            for (int i = 0; i < competitors.size(); i++) {
//                System.out.print(competitors.get(i) + " ");
//            }

            count++;
        }
    }


}