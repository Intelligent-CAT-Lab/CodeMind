Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "abac";
        Map<Character, Integer> dic = new HashMap<>();
        dic.put('a', 0);
        dic.put('b', 0);
        dic.put('c', 0);
        for (char c : s.toCharArray()) {
            dic.put(c, dic.get(c) + 1);
        }
        int a = dic.get('a');
        int b = dic.get('b');
        int c = dic.get('c');
        System.out.println(max(Math.abs(a - b), Math.abs(b - c), Math.abs(c - a)) <= 1 ? "YES" : "NO");
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
```

This Java code does the same thing as your Python code. It creates a HashMap to count the occurrences of each character in the string. Then it calculates the absolute difference between the counts of each character and checks if the maximum difference is less than or equal to 1. If it is, it prints "YES", otherwise it prints "NO". The `max` function is a helper function that returns the maximum of three integers.
