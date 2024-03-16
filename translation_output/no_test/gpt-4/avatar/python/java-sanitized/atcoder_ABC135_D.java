import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String s = line.split(" ")[0];
        int n = s.length();
        int now = 1;
        int[] amari = new int[n];
        for (int i = 0; i < n; i++) {
            amari[i] = now;
            now = (now * 10) % 13;
        }

        int[][] ans = new int[2][13];
        ans[0][0] = 1;
        ans[1][0] = 1;
        for (int i = 0; i < n; i++) {
            now = s.charAt(n - 1 - i);
            for (int j = 0; j < 13; j++) {
                ans[(i + 1) % 2][j] = 0;
            }
            if (now == '?') {
                for (int k = 0; k < 10; k++) {
                    int plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        ans[(i + 1) % 2][(j + plus) % 13] += ans[i % 2][j];
                        ans[(i + 1) % 2][(j + plus) % 13] %= 1000000007;
                    }
                }
            } else {
                int num = Character.getNumericValue(now);
                int plus = (amari[i] * num) % 13;
                for (int j = 0; j < 13; j++) {
                    ans[(i + 1) % 2][(j + plus) % 13] = ans[i % 2][j];
                }
            }
        }
        int last = (n + 1) % 2;
        System.out.println(ans[last][5]);
        scanner.close();
    }
}