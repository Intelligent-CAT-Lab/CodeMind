Below is the Java translation of the provided Python code. Note that Java syntax requires strong typing and explicit array allocation, as well as the differences in the way functions and array indexing work.

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] w = scanner.next().toCharArray();
        int n = w.length;
        int t = -1;
        
        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0) {
                boolean isEqual = true;
                for (int k = 0; k < n - j; k++) {
                    if (w[k] != w[k + j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
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
            int[] zl = Z(w);
            reverse(w);
            int[] zr = Z(w);
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (zl[i] != 0 && zr[n - 2 - i] != 0) {
                    cnt++;
                }
            }
            System.out.println(2);
            System.out.println(cnt);
        }
        
        scanner.close();
    }
    
    public static int[] Z(char[] s) {
        int m = s.length;
        int[] z = new int[m];
        int[] f = new int[m];
        Arrays.fill(f, 1);
        int c = 0;
        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < m && s[j] == s[i + j]) j++;
                z[i] = j;
                c = i;
            }
        }
        for (int p = 1; p < m; p++) {
            for (int k = 2; k < z[p] / p + 2; k++) {
                if (k * p - 1 < m) {
                    f[k * p - 1] = 0;
                }
            }
        }
        return f;
    }
    
    private static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
```

Please ensure you have the correct environment to compile and run Java code as this translation is syntactically correct for Java standards. The logic of the code has been preserved to match the Python code behavior.
