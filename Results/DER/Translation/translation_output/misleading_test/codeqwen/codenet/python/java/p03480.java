Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res = Math.min(res, Math.max(n - i - 1, i + 1));
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, calculates the length of the string, and then iterates over the string to find the minimum value of `n - i - 1` and `i + 1` for each pair of adjacent characters that are not equal. If no such pair is found, it prints the length of the string. Otherwise, it prints the minimum value found.
