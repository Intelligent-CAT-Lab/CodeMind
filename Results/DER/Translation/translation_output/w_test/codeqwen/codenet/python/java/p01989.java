Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String S = System.console().readLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N - 2; a++) {
            for (int b = a + 1; b < N - 1; b++) {
                for (int c = b + 1; c < N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    boolean ok = true;
                    for (String x : new String[]{A, B, C, D}) {
                        int y = Integer.parseInt(x);
                        if (y > 255) {
                            ok = false;
                        }
                        if (y == 0 && x.length() != 1) {
                            ok = false;
                        }
                        if (y != 0 && x.charAt(0) == '0') {
                            ok = false;
                        }
                    }
                    cnt += ok ? 1 : 0;
                }
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the console, calculates the length of the string, and then iterates over all possible combinations of three indices (a, b, c) such that a < b < c < N. For each combination, it splits the string into four substrings (A, B, C, D) and checks if each substring is a valid number (i.e., it does not exceed 255, it is not zero unless it is a single digit, and it does not start with a zero unless it is a single digit). If all four substrings are valid, it increments the
