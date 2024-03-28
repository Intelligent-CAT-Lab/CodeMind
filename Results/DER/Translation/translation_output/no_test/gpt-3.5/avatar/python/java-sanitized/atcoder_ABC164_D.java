import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC164_D {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = 2019;

        long[] tens = new long[s.length() + 1];
        tens[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = (tens[i - 1] * 10) % k;
        }

        long[] mods0toi = new long[s.length()];
        long cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + Character.getNumericValue(s.charAt(i)) * tens[j]) % k;
            cur = mods0toi[i];
        }

        Map<Long, Integer> counter = new HashMap<>();
        int ans = 0;
        for (long mod : mods0toi) {
            counter.put(mod, counter.getOrDefault(mod, 0) + 1);
        }

        for (int count : counter.values()) {
            if (count > 1) {
                ans += (count * (count - 1)) / 2;
            }
        }

        System.out.println(ans);
    }
}