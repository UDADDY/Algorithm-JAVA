import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();

            if (input == -1)
                break;

            List<Integer> factors = new ArrayList<>();

            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    factors.add(i);
                }
            }

            if (factors.stream().mapToInt(Integer::intValue).sum() == input) {
                System.out.print(input + " = ");
                for (int i = 0; i < factors.size(); i++) {
                    if (i == factors.size() - 1) {
                        System.out.println(factors.get(i));
                    } else {
                        System.out.print(factors.get(i) + " + ");
                    }
                }
            } else {
                System.out.println(input + " is NOT perfect.");
            }
        }
    }

}