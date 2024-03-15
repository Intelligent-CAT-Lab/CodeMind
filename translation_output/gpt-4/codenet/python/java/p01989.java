Here's the translated Java code that performs the same operation:

```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.length();
        int cnt = 0;

        for (int a = 1; a < N - 2; a++) {
            for (int b = a + 1; b < N - 1; b++) {
                for (int c = b + 1; c < N; c++) {
                    boolean ok = true;
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    for (String x : new String[] {A, B, C, D}) {
                        int y = Integer.parseInt(x);
                        if (y > 255) {
                            ok = false;
                        }
                        if (y == 0 && x.length() != 1) {
                            ok = false;
                        }
                        if (y != 0 && x.startsWith("0")) {
                            ok = false;
                        }
                    }
                    cnt += ok ? 1 : 0;
                }
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
```

This Java code includes the necessary imports and avoids the use of the `combinations` function from Python's `itertools`, as Java's standard library doesn't provide an equivalent function. Instead, the code uses nested loops to generate the necessary combinations.
