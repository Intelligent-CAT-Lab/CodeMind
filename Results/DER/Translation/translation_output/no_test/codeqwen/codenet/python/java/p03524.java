Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String S = System.console().readLine();

        Map<Character, Integer> s_frq_dict = new HashMap<>();
        for (char s : S.toCharArray()) {
            s_frq_dict.put(s, s_frq_dict.getOrDefault(s, 0) + 1);
        }

        int[] frqs = new int[s_frq_dict.size()];
        int i = 0;
        for (int freq : s_frq_dict.values()) {
            frqs[i++] = freq;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int freq : frqs) {
            if (freq > max) {
                max = freq;
            }
            if (freq < min) {
                min = freq;
            }
        }

        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the console, counts the frequency of each character in the string, and then checks if the difference between the maximum and minimum frequencies is less than or equal to 1. If it is, it prints "YES", otherwise it prints "NO".
