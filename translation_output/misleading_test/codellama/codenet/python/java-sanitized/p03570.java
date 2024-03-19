public class p03570 {
    public static void main(String[] args) {
        String str = "aabxyyzz";
        System.out.println(f(str));
    }

    public static int f(String str) {
        int[] s = new int[1000000];
        s[0] = 0;
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }

        int lenOfStr = str.length();

        for (int i = 0; i < lenOfStr; i++) {
            char c = str.charAt(i);
            pat ^= bits[c - 'a'];
            s[pat] = Math.min(Math.min(s.get(pat ^ bits[c - 'a'], lenOfStr) + 1), s.get(pat, lenOfStr));
        }

        if (pat == 0) {
            return 1;
        }

        return s[pat];
    }
}