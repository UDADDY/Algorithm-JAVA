import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11723 {
    private static int N;
    private static Boolean[] set = new Boolean[21];
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 1; i < 21; i++)
            set[i] = false;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if (st.countTokens() == 2) {
                String command = st.nextToken();
                Integer x = Integer.parseInt(st.nextToken());
                execute(command, x);
            } else {
                execute(st.nextToken());
            }
        }

        br.close();
        bw.close();
    }

    private static void execute(String command) {
        switch (command) {
            case "all":
                all();
                break;
            case "empty":
                empty();
                break;
        }
    }

    private static void execute(String command, Integer x) throws IOException {
        switch (command) {
            case "add":
                add(x);
                break;
            case "remove":
                remove(x);
                break;
            case "check":
                bw.write(String.valueOf(check(x)));
                bw.write("\n");
                break;
            case "toggle":
                toggle(x);
                break;
        }
    }

    public static void add(int x) {
        set[x] = true;
    }

    public static void remove(int x) {
        set[x] = false;
    }

    public static int check(int x) {
        if (set[x])
            return 1;
        return 0;
    }

    public static void toggle(int x) {
        set[x] = !set[x];
    }

    public static void all() {
//        for (int i = 1; i < 21; i++)
//            set[i] = true;
        Arrays.fill(set, true);
    }

    public static void empty() {
//        for (int i = 1; i < 21; i++)
//            set[i] = false;
        Arrays.fill(set, false);
    }
}