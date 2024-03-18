Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1, r = n;
        
        while ( l < r ) {
            int mid = l + ( r - l ) / 2;
            long idxcnt = (long) mid * (mid + 1) / 2;
            if ( idxcnt < n ) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        
        l -= 1;
        long idxcnt = (long) l * (l + 1) / 2;
        System.out.println(n - idxcnt);
        
        scanner.close();
    }
}
```

To test the Java program, you can compile and run it, then input `99992` and expect the output to be `405`. The main differences from the Python code are the need to handle input/output differently in Java and the use of explicit type casting `(long)` to prevent integer overflow when multiplying `mid` by `(mid + 1)`.
