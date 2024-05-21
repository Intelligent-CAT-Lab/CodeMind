import java.util.*;

public class p03570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
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
        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            s.put(pat, Math.min(
                    Math.min(s.getOrDefault(pat ^ bits[c - 'a'], lenOfStr) + 1,
                            s.getOrDefault(pat, lenOfStr)),
                    lenOfStr));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}