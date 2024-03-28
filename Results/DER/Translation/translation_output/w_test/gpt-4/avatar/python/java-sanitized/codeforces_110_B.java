import java.util.Scanner;

public class codeforces_110_B {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        new Thread(null, Main::run, "Main", 1 << 27).start();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        for (int i = 0; i < t; ++i) {
            solution(scanner);
        }
        scanner.close();
    }

    private static void solution(Scanner scanner) {
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; ++i) {
            sb.append("abcd");
        }
        sb.append("abc".substring(0, n % 4));
        System.out.println(sb.toString());
    }
}