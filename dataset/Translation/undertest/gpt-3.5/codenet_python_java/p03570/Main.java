import java.util.*;

public class p03570 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findUniqueSubstring(str));
    }

    public static int findUniqueSubstring(String str) {
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }

        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            int minValue = lenOfStr;
            for (int bit : bits) {
                minValue = Math.min(s.getOrDefault(pat ^ bit, lenOfStr) + 1, minValue);
            }
            s.put(pat, Math.min(s.getOrDefault(pat, lenOfStr), minValue));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}