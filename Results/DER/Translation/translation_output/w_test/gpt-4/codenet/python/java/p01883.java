Here is the Python code translated into Java. You will need to implement reading from standard input and writing to standard output:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    
    private static final int[] a = new int[50000];
    
    static {
        // Precompute the triangle numbers
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + i;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
        scanner.close();
    }
    
    private static String solve(int n) {
        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            // If 'n' is not a perfect triangle number, find the insertion point
            t = -t - 1;
        }
        int total = 2 * t;
        char[] r = new char[total];
        Arrays.fill(r, 0, t, '(');
        Arrays.fill(r, t, total, ')');
        
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                // Swap
                char temp = r[ti];
                r[ti] = r[ti - ts];
                r[ti - ts] = temp;
                n -= t - ts;
            } else {
                break;
            }
        }
        
        return new String(r);
    }
}
```

In this code, I used a static initializer block to precompute the triangle numbers similar to the Python array `a` (which in Python is dynamically extended in the loop, but in Java, we need to specify the size before populating it).

Since there's no direct equivalent for Python's `bisect.bisect_left` in the Java standard library, I've used `Arrays.binarySearch` which returns a negative value if the key is not found, hence the need for the "-t -1" trick to find the correct insertion point. The `solve` function is using a char array `r` to store the parentheses sequence and prints them as a single string at the end.

Note: This Java program expects the input to be a single integer value read from the standard input.

Please ensure that the handling of the standard input and standard output (as well as eventual exceptions) fits your specific environment and constraints, as Java can be quite strict regarding how input and output are handled compared to Python.
