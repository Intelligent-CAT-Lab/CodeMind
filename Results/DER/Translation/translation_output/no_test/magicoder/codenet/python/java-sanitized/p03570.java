import java.util.HashMap;
import java.util.Scanner;

public class p03570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }
        int lenOfStr = str.length();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            pat ^= bits[c - 'a'];
            int min = lenOfStr;
            for (int bit : bits) {
                int temp = s.getOrDefault(pat ^ bit, lenOfStr) + 1;
                if (temp < min) {
                    min = temp;
                }
            }
            s.put(pat, Math.min(min, s.getOrDefault(pat, lenOfStr)));
        }

        if (pat == 0) {
            return 1;
        }

        return s.getOrDefault(pat, lenOfStr);
    }
}