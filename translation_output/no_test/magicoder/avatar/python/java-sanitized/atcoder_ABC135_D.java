import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        long now = 1;
        long[] amari = new long[n];
        for (int i = 0; i < n; i++) {
            amari[i] = now;
            now = (now * 10) % 13;
        }
        long[][] ans = new long[2][13];
        ans[0][0] = 1;
        ans[1][0] = 1;
        int last = 0;
        for (int i = 0; i < n; i++) {
            char nowChar = s.charAt(n - 1 - i);
            ans[(i + 1) % 2] = new long[13];
            if (nowChar == '?') {
                for (int k = 0; k < 10; k++) {
                    long plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        ans[(i + 1) % 2][(int) ((j + plus) % 13)] += ans[i % 2][j];
                        ans[(i + 1) % 2][(int) ((j + plus) % 13)] %= 1000000007;
                    }
                }
            } else {
                long now = Character.getNumericValue(nowChar);
                long plus = (amari[i] * now) % 13;
                for (int j = 0; j < 13; j++) {
                    ans[(i + 1) % 2][(int) ((j + plus) % 13)] = ans[i % 2][j];
                }
            }
            last = (i + 1) % 2;
        }
        System.out.println(ans[last][5]);
    }
}