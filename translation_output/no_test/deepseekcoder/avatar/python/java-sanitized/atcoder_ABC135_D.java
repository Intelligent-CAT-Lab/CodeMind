import java.util.Scanner;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = String.valueOf(s.charAt(0));
        int n = s.length();
        long[] amari = new long[n];
        long now = 1;
        for (int i = 0; i < n; i++) {
            amari[i] = now;
            now = (now * 10) % 13;
        }
        long[][] ans = new long[2][13];
        ans[0][0] = ans[1][0] = 1;
        int last = 0;
        for (int i = 0; i < n; i++) {
            now = "?".equals(String.valueOf(s.charAt(n - 1 - i))) ? -1 : Long.parseLong(String.valueOf(s.charAt(n - 1 - i)));
            ans[1 - last] = new long[13];
            if (now == -1) {
                for (int k = 0; k < 10; k++) {
                    long plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        ans[1 - last][(int) ((j + plus) % 13)] += ans[last][j];
                        ans[1 - last][(int) ((j + plus) % 13)] %= 1000000007;
                    }
                }
            } else {
                long plus = (amari[i] * now) % 13;
                for (int j = 0; j < 13; j++) {
                    ans[1 - last][(int) ((j + plus) % 13)] = ans[last][j];
                }
            }
            last = 1 - last;
        }
        System.out.println(ans[last][5]);
    }
}