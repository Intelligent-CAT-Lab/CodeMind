import java.util.*;

public class p03570 {
    public static int f(String str) {
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (1 << i);
        }
        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            s.put(pat, Math.min(
                    Math.min(s.get(pat ^ bits[c - 'a']), lenOfStr) + 1,
                    s.get(pat, lenOfStr)));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(f(str));
    }
}