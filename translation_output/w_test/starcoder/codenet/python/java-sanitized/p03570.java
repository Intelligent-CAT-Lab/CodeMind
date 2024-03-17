import java.util.*;

public class p03570 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(f(str));
    }

    public static int f(String str) {
        int[] s = new int[1 << 26];
        s[0] = 0;
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }
        int lenOfStr = str.length();

        for (int i = 0; i < str.length(); i++) {
            pat ^= bits[str.charAt(i) - 'a'];
            s[pat] = Math.min(Math.min(s[pat ^ bits[str.charAt(i) - 'a']] + 1, s[pat]), lenOfStr);
        }

        if (pat == 0) {
            return 1;
        }

        return s[pat];
    }
}