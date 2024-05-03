Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = System.console().readLine();
        System.out.println(f(str));
    }

    public static int f(String str) {
        Map<Integer, Integer> s = new HashMap<>();
        s.put(0, 0);
        int pat = 0;

        int[] bits = new int[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = (int) Math.pow(2, i);
        }

        for (char c : str.toCharArray()) {
            pat ^= bits[c - 'a'];
            s.put(pat, Math.min(
                    Math.min(s.getOrDefault(pat ^ bit, str.length()) + 1, s.getOrDefault(pat, str.length())),
                    s.getOrDefault(pat, str.length())));
        }

        if (pat == 0) {
            return 1;
        }

        return s.get(pat);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the console, calculates the minimum length of the shortest substring that has no repeating characters, and prints the result.
