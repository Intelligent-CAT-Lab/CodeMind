import java.util.Scanner;

public class codeforces_110_B {

    private static final long MOD = 1000000007L;

    private static void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            output.append("abcd");
        }
        output.append("abc".substring(0, n % 4));
        System.out.println(output);
        scanner.close();
    }

    public static void main(String[] args) {
        int t = 1; // Number of test cases is set to 1, similar to the Python code
        for (int i = 0; i < t; i++) {
            solution();
        }
    }
}