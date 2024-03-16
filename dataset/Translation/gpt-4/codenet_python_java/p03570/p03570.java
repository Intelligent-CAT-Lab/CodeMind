import java.util.HashMap;
import java.util.Scanner;

public class p03570 {
    
    public static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;
        
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (1 << i);
        }
        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            int minLength = lenOfStr;
            for (int bit : bits) {
                minLength = Math.min(minLength, s.getOrDefault(pat ^ bit, lenOfStr) + 1);
            }
            s.put(pat, Math.min(minLength, s.getOrDefault(pat, lenOfStr)));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        System.out.println(f(input));
    }
}