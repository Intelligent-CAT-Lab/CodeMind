```java
import java.util.Scanner;
import java.util.HashMap;

public class UniqueSubstrings {

    public static int f(String str) {
        HashMap<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = 1 << i;
        }

        int lenOfStr = str.length();

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            int minVal = lenOfStr;
            for (int bit : bits) {
                minVal = Math.min(s.getOrDefault(pat ^ bit, lenOfStr) + 1, minVal);
            }
            s.put(pat, Math.min(s.getOrDefault(pat, lenOfStr), minVal));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(f(str));
    }
}
```
