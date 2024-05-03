Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static ArrayList<Long> l = new ArrayList<>();
    static long limit = 10000000000L;

    static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }

    static void main(String[] args) {
        gen(0, 0, 0);
        Collections.sort(l);
        long n = Long.parseLong(System.console().readLine());
        long ans = 0;
        for (long val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

Please note that in Java, we use `ArrayList` instead of `list` and `long` instead of `int` for large numbers. Also, Java does not have a built-in function to read input from the console, so we use `System.console().readLine()` to get the input.
