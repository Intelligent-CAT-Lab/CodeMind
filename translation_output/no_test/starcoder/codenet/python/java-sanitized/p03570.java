import java.util.*;

public class p03570 {

    public static int f(String str) {
        int lenOfStr = str.length();
        int[] s = new int[1 << 26];
        s[0] = 0;
        int pat = 0;
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }
        for (int i = 0; i < lenOfStr; i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            s[pat] = Math.min(Math.min(s[pat ^ bits[str.charAt(i) - 'a']] + 1, s[pat]), lenOfStr);
        }
        if (pat == 0) {
            return 1;
        }
        return s[pat];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(f(str));
    }
}