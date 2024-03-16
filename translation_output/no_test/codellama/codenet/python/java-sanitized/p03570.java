import java.util.Scanner;

public class p03570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }

        int lenOfStr = str.length();
        int pat = 0;
        int[] s = new int[lenOfStr];
        s[0] = 0;

        for (int i = 0; i < lenOfStr; i++) {
            char c = str.charAt(i);
            pat ^= bits[c - 'a'];
            s[pat] = Math.min(Math.min(s.get(pat ^ bit, lenOfStr) + 1, s.get(pat, lenOfStr)), s[pat]);
        }

        if (pat == 0) {
            return 1;
        }

        return s[pat];
    }
}