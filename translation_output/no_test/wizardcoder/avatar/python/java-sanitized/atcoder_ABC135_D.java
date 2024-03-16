import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        s = s[0];
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
            int last = (i + 1) % 2;
            ans[last] = new int[13];
            if (s.charAt(n - 1 - i) == '?') {
                for (int k = 0; k < 10; k++) {
                    int plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        ans[last][(j + plus) % 13] += ans[i % 2][j];
                        ans[last][(j + plus) % 13] %= 1000000007;
                    }
                }
            } else {
                int nowInt = Integer.parseInt(s.charAt(n - 1 - i) + "");
                int plus = (amari[i] * nowInt) % 13;
                for (int j = 0; j < 13; j++) {
                    ans[last][(j + plus) % 13] = ans[i % 2][j];
                }
            }
        }
        System.out.println(ans[(n + 1) % 2][5]);
    }
}