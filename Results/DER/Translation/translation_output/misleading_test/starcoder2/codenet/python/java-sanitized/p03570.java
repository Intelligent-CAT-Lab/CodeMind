import java.util.HashMap;
import java.util.Scanner;

public class p03570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }
        int lenOfStr = str.length();
        for (int i = 0; i < lenOfStr; i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            int min = lenOfStr;
            for (int bit : bits) {
                int tmp = pat ^ bit;
                if (s.containsKey(tmp)) {
                    min = Math.min(min, s.get(tmp) + 1);
                }
            }
            s.put(pat, Math.min(min, s.getOrDefault(pat, lenOfStr)));
        }
        if (pat == 0) {
            return 1;
        }
        return s.get(pat);
    }
}