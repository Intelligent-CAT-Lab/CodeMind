Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        while (true) {
            m += 1;
            if (pre % 2 == 0) {
                pre = pre / 2;
            } else {
                pre = 3 * pre + 1;
            }
            if (st.contains(pre)) {
                System.out.println(m);
                return;
            }
            st.add(pre);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, solves the problem, and prints the result. The `solve` function is the same as your Python function. It uses a `HashSet` to keep track of the numbers it has seen so far.
