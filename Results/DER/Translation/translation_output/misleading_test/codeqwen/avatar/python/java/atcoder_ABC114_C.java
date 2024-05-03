Here is the Java version of your Python code:

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        System.out.println(aaa(0, N));
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        for (char c : String.valueOf(n).toCharArray()) {
            set.add(c);
        }
        boolean isValid = set.contains('7') && set.contains('5') && set.contains('3');
        int ans = isValid ? 1 : 0;
        for (char i : new char[]{'7', '5', '3'}) {
            ans += aaa(n + i - '0', N);
        }
        return ans;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, then calls the `aaa` function with that integer and the maximum integer value. The `aaa` function checks if the current number is valid (contains the digits 3, 5, and 7), and if so, increments the answer. It then recursively calls itself with each digit appended to the current number. The recursion stops when the current number exceeds the maximum value.
