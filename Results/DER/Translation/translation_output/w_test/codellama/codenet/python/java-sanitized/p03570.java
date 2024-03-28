public class p03570 {
    public static void main(String[] args) {
        String str = "aabxyyzz";
        System.out.println(f(str));
    }

    public static int f(String str) {
        int[] s = new int[1 << 26];
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


* In Java, we use `int` instead of `int[]` to represent the `s` array.
* In Java, we use `Math.pow(2, i)` instead of `2**i` to calculate the powers of 2.
* In Java, we use `charAt(i)` instead of `str[i]` to access the characters of the string.
* In Java, we use `Math.min(a, b)` instead of `min(a, b)` to calculate the minimum of two values.
* In Java, we use `System.out.println(f(str))` instead of `print(f(str))` to print the result.