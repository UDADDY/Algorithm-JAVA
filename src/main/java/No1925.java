import java.util.Scanner;

public class No1925 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Straight
        float gradient1to2 = (float) (y2 - y1) / (x2 - x1);
        float gradient1to3 = (float) (y3 - y1) / (x3 - x1);
        if (gradient1to2 == gradient1to3) {
            System.out.println("X");
            return;
        }

        // Equilateral triangle
        int segment1To2Square = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        int segment1To3Square = ((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        int segment2To3Square = ((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        if (segment1To2Square == segment1To3Square && segment1To2Square == segment2To3Square) {
            System.out.println("JungTriangle");
            return;
        }

        // Isosceles triangle
        if ((segment1To2Square == segment1To3Square && segment1To2Square != segment2To3Square)) {
            if (segment1To2Square + segment1To3Square == segment2To3Square) {
                System.out.println("Jikkak2Triangle");
                return;
            }
            if (segment1To2Square + segment1To3Square < segment2To3Square) {
                System.out.println("Dunkak2Triangle");
                return;
            }
            if (segment1To2Square + segment1To3Square > segment2To3Square) {
                System.out.println("Yeahkak2Triangle");
                return;
            }
        }
        if (segment1To2Square == segment2To3Square && segment1To2Square != segment1To3Square) {
            if (segment1To2Square + segment2To3Square == segment1To3Square) {
                System.out.println("Jikkak2Triangle");
                return;
            }
            if (segment1To2Square + segment2To3Square < segment1To3Square) {
                System.out.println("Dunkak2Triangle");
                return;
            }
            if (segment1To2Square + segment2To3Square > segment1To3Square) {
                System.out.println("Yeahkak2Triangle");
                return;
            }
        }
        if (segment1To3Square == segment2To3Square && segment2To3Square != segment1To2Square) {
            if (segment1To3Square + segment2To3Square == segment1To2Square) {
                System.out.println("Jikkak2Triangle");
                return;
            }
            if (segment1To3Square + segment2To3Square < segment1To2Square) {
                System.out.println("Dunkak2Triangle");
                return;
            }
            if (segment1To3Square + segment2To3Square > segment1To2Square) {
                System.out.println("Yeahkak2Triangle");
                return;
            }
        }

        // Each other Differt
        if (segment1To2Square != segment1To3Square && segment1To2Square != segment2To3Square && segment2To3Square != segment1To3Square) {
            if (segment1To2Square > segment1To3Square && segment1To2Square > segment2To3Square) {
                int tmp = segment2To3Square;
                segment2To3Square = segment1To2Square;
                segment1To2Square = tmp;
            }
            if (segment1To3Square > segment1To2Square && segment1To3Square > segment2To3Square) {
                int tmp = segment2To3Square;
                segment2To3Square = segment1To3Square;
                segment1To3Square = tmp;
            }

            if (segment1To2Square + segment1To3Square == segment2To3Square) {
                System.out.println("JikkakTriangle");
                return;
            }
            if (segment1To2Square + segment1To3Square < segment2To3Square) {
                System.out.println("DunkakTriangle");
                return;
            }
            if (segment1To2Square + segment1To3Square > segment2To3Square) {
                System.out.println("YeahkakTriangle");
                return;
            }
        }
    }
}