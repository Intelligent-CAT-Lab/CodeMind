import java.util.*;
import java.io.*;

public class atcoder_ABC164_D {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long[] tens;
    static long[] mods0toi;
    static final int k = 2019;
    static long[] count;

    public static void main(String[] args) throws IOException {
        String s = next();
        tens = new long[s.length() + 1];
        mods0toi = new long[s.length()];
        count = new long[k];

        tens[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = tens[i - 1] * 10 % k;
        }

        long cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
            count[(int) mods0toi[i]]++;
        }

        long ans = 0;
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                ans += count[i];
            }
            ans += (count[i] * (count[i] - 1)) / 2;
        }
        System.out.println(ans);
    }
}