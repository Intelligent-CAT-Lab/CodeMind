Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1; //1 is R, 0 is L
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc++;
                    if (i + 1 < n && s.charAt(i + 1) == 'L') {
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
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
```

Please note that this Java code assumes the input is read from `System.in` (the console), which is the standard input stream. The output is printed to the console with each count separated by a space, ending with a newline as per the expected result.
