Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String S = "123456789";
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                for (int c = b + 1; c < N; c++) {
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
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

This Java code does the same thing as your Python code. It iterates over all possible combinations of three indices in the string `S`, and for each combination, it checks if the substring formed by those indices is a valid number (i.e., it does not exceed 255, does not start with a zero unless it is a single digit, and does not contain any leading zeros). If all these conditions are met, it increments the counter `cnt`. Finally, it prints the value of `cnt`.
