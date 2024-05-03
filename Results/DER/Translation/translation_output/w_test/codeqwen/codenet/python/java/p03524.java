Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String S = "abac";
        Map<Character, Integer> s_frq_dict = new HashMap<>();
        s_frq_dict.put('a', 0);
        s_frq_dict.put('b', 0);
        s_frq_dict.put('c', 0);

        for (char s : S.toCharArray()) {
            s_frq_dict.put(s, s_frq_dict.get(s) + 1);
        }

        int[] frqs = new int[3];
        int i = 0;
        for (int freq : s_frq_dict.values()) {
            frqs[i++] = freq;
        }

        if (Math.max(frqs[0], Math.max(frqs[1], frqs[2])) - Math.min(frqs[0], Math.min(frqs[1], frqs[2])) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It creates a HashMap to store the frequency of each character in the string. Then it calculates the maximum and minimum frequencies and checks if the difference is less than or equal to 1. If it is, it prints "YES", otherwise it prints "NO".
