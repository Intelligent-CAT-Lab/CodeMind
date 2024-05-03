Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1; //1 for R, 0 for L
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            //System.out.println(Arrays.toString(ans) + " " + rc + " " + lc + " " + p);
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc++;
                    if (i < n - 1 && s.charAt(i + 1) == 'L') {
                        ans[i] += (rc + 1) / 2;
                        ans[i + 1] += rc / 2;
                        state = 0;
                        p = i;
                        rc = 0;
                    }
                }
            } else {
                if (s.charAt(i) == 'L') {
                    lc++;
                    if (i == n - 1 || s.charAt(i + 1) == 'R') {
                        ans[p + 1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

Please note that in Java, we use `charAt(index)` to get the character at a specific index in a string, and `System.out.print(value)` to print a value without a newline
