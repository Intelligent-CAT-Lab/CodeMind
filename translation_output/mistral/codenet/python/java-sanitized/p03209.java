import java.util.*;
import java.io.*;

public class p03209 {
    static final int INF = (int) 1e18;
    static final int MOD = (int) 1e9 + 7;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N, X;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        int[] l = new int[51];
        int[] p = new int[51];

        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i < 51; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        int ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans++;
                break;
            }

            if (X <= 1) {
                break;
            } else if (X <= l[i - 1] + 1) {
                X--;
                continue;
            } else if (X == l[i - 1] + 2) {
                ans++;
                X -= 2;
            } else {
                ans += p[i - 1] + 1;
                X -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}