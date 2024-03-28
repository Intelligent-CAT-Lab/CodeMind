import java.util.*;

public class p03073 {
    static int[] LI() {
        String input = System.console().readLine();
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int II() {
        return Integer.parseInt(System.console().readLine());
    }

    static String[] LS() {
        return System.console().readLine().split(" ");
    }

    static int INF = (int) 1e18;
    static int MOD = (int) 1e9 + 7;

    static int[] LI_() {
        String input = System.console().readLine();
        return Arrays.stream(input.split(" ")).mapToInt(x -> Integer.parseInt(x) - 1).toArray();
    }

    static double[] LF() {
        String input = System.console().readLine();
        return Arrays.stream(input.split(" ")).mapToDouble(Double::parseDouble).toArray();
    }

    static String SI() {
        return System.console().readLine();
    }

    static void YN(boolean b) {
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static void yn(boolean b) {
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = SI().strip();

        int N = S.length();

        int zero_start = 0;
        int zero_start_counter = 0;
        for (int i = 0; i < N; i++) {
            if (zero_start != Integer.parseInt(S.charAt(i) + "")) {
                zero_start_counter++;
            }
            zero_start = (zero_start + 1) % 2;
        }

        int one_start_counter = N - zero_start_counter;

        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }
}