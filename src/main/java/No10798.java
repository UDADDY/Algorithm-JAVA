import java.util.Scanner;

public class No10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        int maxLengthIndex = 0;
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                maxLengthIndex = i;
            }
        }


        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j].length() > i) {
                    System.out.print(arr[j].charAt(i));
                }
            }
        }


    }

}