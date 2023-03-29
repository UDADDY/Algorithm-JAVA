import java.util.Scanner;

public class No1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String s1 = str.split(" ")[0];
        String s2 = str.split(" ")[1];

        int maxCount = 0;

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            int count = 0;

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(i + j)) {
                    count++;
                }
            }

            if (count > maxCount)
                maxCount = count;
        }

        System.out.println(s1.length() - maxCount);
    }

}