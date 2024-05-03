Here is the Java version of the provided Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> dic = new HashMap<>();
        String S = java.util.Scanner.in.nextLine();
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
        System.out.println(ans / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, counts the occurrences of each character in the string, and then counts the number of characters that occur an odd number of times. The result is then divided by 2 and printed to the standard output.
