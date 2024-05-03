Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N == 0) {
            return;
        }
        Set<Integer> l = new HashSet<>();
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= (int) Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += (int) Math.pow(2, r);
            }
        }
        int[] s = new int[l.size() + 1];
        for (int i : l) {
            s[i] = 1;
        }
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += (int) Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }

    public static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= (int) Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, performs the operations as described in your Python code, and prints the result.
