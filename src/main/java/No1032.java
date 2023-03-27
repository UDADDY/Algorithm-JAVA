import java.util.Scanner;

public class No1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] files = new String[N];

        for (int i = 0; i < N; i++) {
            files[i] = sc.nextLine();
        }


        boolean isSame = true;

        for (int i = 0; i < files[0].length(); i++) {
            isSame = true;
            for (int j = 0; j < N; j++) {
                if (files[0].charAt(i) != files[j].charAt(i)) {
                    System.out.print("?");
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                System.out.print(files[0].charAt(i));
        }
    }
}