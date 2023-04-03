import java.util.Scanner;

public class No1515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();

        int ptr = 0;

        for (int i = 1; i <= 30000; i++) {
            String tmp = String.valueOf(i);
            for (int j = 0; j < tmp.length(); j++) {
                if (tmp.charAt(j) == N.charAt(ptr))
                    ptr++;
                if (ptr == N.length()) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}