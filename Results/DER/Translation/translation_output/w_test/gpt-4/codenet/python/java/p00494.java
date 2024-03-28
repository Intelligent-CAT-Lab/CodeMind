Here is the Java equivalent of the provided Python code. This Java code will need to be compiled and executed in a Java environment.

```java
import java.util.Scanner;

public class SequenceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int l = a.length();
        int i = 0;
        int ans = 0;

        while (i < l) {
            int lenj = 0;
            int leno = 0;
            int leni = 0;

            while (i < l && a.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < l && a.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < l && a.charAt(i) == 'I') {
                leni++;
                i++;
            }
            if (lenj >= leno && leni >= leno) {
                ans = Math.max(ans, leno);
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

To use this Java program, compile it and run it with the sample test input. When prompted, input the given sequence ("OJJOOIIOJOI"), and the program will output the expected result of `2`.
