Here's the Java translation of the provided Python code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {

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
```

This Java code defines a `main` method to take the input string from command line (standard input), and then it defines the method `f` that computes the required output specified by the original Python code. It uses a `HashMap` to mimic the behavior of Python dictionaries, and `bit` patterns are generated using left bit-shift operations. The `getOrDefault` method is used to handle cases where the `pat` or `pat ^ bit` does not already exist in the map.
