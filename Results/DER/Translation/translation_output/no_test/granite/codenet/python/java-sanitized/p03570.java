import java.util.*;

public class p03570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }
        int lenOfStr = str.length();
        int pat = 0;
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        for (int i = 0; i < lenOfStr; i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            if (s.containsKey(pat)) {
                s.put(pat, Math.min(s.get(pat), i + 1));
            } else {
                s.put(pat, i + 1);
            }
        }
        if (pat == 0) {
            System.out.println(1);
        } else {
            System.out.println(s.get(pat));
        }
    }
}