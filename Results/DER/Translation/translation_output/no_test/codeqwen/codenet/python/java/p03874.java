Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int n = 512;
        int pattern = 0;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / factorial(i) / factorial(7);
            a.add(val);
        }
        Collections.reverse(a);

        int cnt = 600 * 7;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("FESTIVA");
            sb.append(repeat("L", k / a.get(i)));
            k %= a.get(i);
            ans.add(sb.toString());
        }
        Collections.reverse(ans);
        System.out.println(String.join("", ans));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static String repeat(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `k` from the standard input, calculates the factorial of numbers from 7 to 512, and then uses these values to generate a list of strings. Each string is "FESTIVA" followed by the appropriate number of "L"s. The strings are then reversed and printed out.
