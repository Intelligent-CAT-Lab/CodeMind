import java.util.HashMap;
import java.util.Map;

public class p03570 {
    public static void main(String[] args) {
        String str = System.console().readLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            s.put(pat, Math.min(
                    Math.min(s.getOrDefault(pat ^ bit, str.length()) + 1, s.getOrDefault(pat, str.length())),
                    s.getOrDefault(pat, str.length())));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}