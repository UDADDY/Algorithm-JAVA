import java.util.Arrays;
import java.util.Scanner;

public class No5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();

            if (side1 == 0 && side2 == 0 && side3 == 0)
                return;

            Integer[] sides = {side1, side2, side3};
            Arrays.sort(sides);

            if (sides[2] >= sides[1] + sides[0])
                System.out.println("Invalid");
            else if (side1 == side2 && side1 == side3)
                System.out.println("Equilateral");
            else if ((side1 == side2) || (side1 == side3) || (side2 == side3))
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }
}