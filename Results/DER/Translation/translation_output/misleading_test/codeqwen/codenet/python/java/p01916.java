Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String S = "hcpc";
        Map<Character, Integer> dic = new HashMap<>();
        for (char s : S.toCharArray()) {
            if (!dic.containsKey(s)) {
                dic.put(s, 1);
            } else {
                dic.put(s, dic.get(s) + 1);
            }
        }
        int ans = 0;
        for (char k : dic.keySet()) {
            if (dic.get(k) % 2 != 0) {
                ans += 1;
            }
        }
        System.out.println(ans >> 1);
    }
}
```

This Java code does the same thing as your Python code. It reads a string, counts the occurrences of each character, and then counts the number of characters that occur an odd number of times. The result is then divided by 2 and printed.
