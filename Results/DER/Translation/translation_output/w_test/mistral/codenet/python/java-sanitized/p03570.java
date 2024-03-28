import java.util.*;

public class p03570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = f(str);
        System.out.println(result);
    }

    public static int f(String str) {
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (1 << i);
        }

        int lenOfStr = str.length();
        for (int i = 0; i < lenOfStr; i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            s.put(pat, Math.min(s.getOrDefault(pat, lenOfStr) + 1, s.getOrDefault(pat, lenOfStr)));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}