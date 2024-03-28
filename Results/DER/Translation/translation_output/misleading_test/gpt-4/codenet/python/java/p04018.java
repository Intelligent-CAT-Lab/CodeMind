Below is the translated Java code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static char[] w;
    static int n;
    static int t = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        w = scanner.next().toCharArray();
        n = w.length;

        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0) {
                boolean equalSubstrings = true;
                for (int i = 0; i < n - j; i++) {
                    if (w[i] != w[i + j]) {
                        equalSubstrings = false;
                        break;
                    }
                }
                if (equalSubstrings) {
                    t = j;
                    break;
                }
            }
        }

        if (t == -1) {
            System.out.println("1\n1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            List<Integer> zl = Z(Arrays.copyOfRange(w, 0, n));
            reverse(w);
            List<Integer> zr = Z(Arrays.copyOfRange(w, 0, n));
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (zl.get(i) != 0 && zr.get(n - 2 - i) != 0) cnt++;
            }
            System.out.println(2);
            System.out.println(cnt);
        }
    }

    public static List<Integer> Z(char[] s) {
        int m = s.length;
        Integer[] z = new Integer[m];
        Arrays.fill(z, 0);
        int c = 0;
        Integer[] f = new Integer[m];
        Arrays.fill(f, 1);

        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < n && s[j] == s[i + j]) j++;
                z[i] = j;
                c = i;
            }
        }

        for (int p = 1; p < m; p++) {
            for (int k = 2; k <= z[p] / p + 1; k++) {
                f[k * p - 1] = 0;
            }
        }

        return Arrays.asList(f);
    }

    public static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
```

Please note that the semantics of Python and Java arrays/lists are slightly different, and the above translation captures the logic in a Java context.

Moreover, I used `List<Integer>` instead of a simple array due to the convenience of the `Arrays.asList` function, which requires a boxed array (`Integer[]`) instead of a primitive array (`int[]`). For a real-world scenario, it would be recommended to use primitive arrays for performance reasons, instead of the boxed versions (`Integer`).
