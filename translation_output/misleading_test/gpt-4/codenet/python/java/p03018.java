Here's the given Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        long ans = 0;
        int a = 0;
        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == 'A') {
                a += 1;
                i += 1;
            } else if (i + 1 < S.length() && S.charAt(i) == 'B' && S.charAt(i + 1) == 'C') {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
```

This Java program should produce the same results as the given Python code when given the test input "ABCABC". The expected output is `82`. The program reads a string from the standard input, then iteratively processes each character to calculate the answer. When the character 'A' is found, a counter is incremented, and when the sequence "BC" is found, the current value of `a` is added to the running total `ans`. For any other character, if neither 'A' nor 'BC' is found, `a` is reset to 0.
