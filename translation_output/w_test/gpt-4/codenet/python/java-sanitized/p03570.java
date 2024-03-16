import java.util.HashMap;
import java.util.Scanner;

public class p03570 {

    private static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;
        
        // Generating bit patterns for each character from 'a' to 'z'
        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }
        
        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            int minSteps = lenOfStr;
            for (int bit : bits) {
                minSteps = Math.min(minSteps, s.getOrDefault(pat ^ bit, lenOfStr) + 1);
            }
            s.put(pat, Math.min(s.getOrDefault(pat, lenOfStr), minSteps));
        }

        if (pat == 0) {
            return 1;
        }

        return s.getOrDefault(pat, lenOfStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(f(inputStr));
        scanner.close();
    }
}