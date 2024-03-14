import java.util.*;
import java.io.*;

public class atcoder_ABC164_D {
    static int mod = 1000000007;
    static int k = 2019;
    static int[] tens;
    static int[] mods0toi;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        tens = new int[s.length() + 1];
        mods0toi = new int[s.length()];
        tens[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = (tens[i - 1] * 10) % k;
        }
        int cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : mods0toi) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for (int c : map.keySet()) {
            if (c == 0) {
                ans += map.get(c);
            }
            ans += (map.get(c) * (map.get(c) - 1)) / 2;
        }
        System.out.println(ans);
    }
}