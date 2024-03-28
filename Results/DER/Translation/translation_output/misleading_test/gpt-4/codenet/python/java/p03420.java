Here is the translated Python code into Java, complete with `Scanner` for input and `System.out.println` for output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        long s = 0;
        for (int b = K+1; b <= N; b++) {
            long an = 0;
            long j = N / b;
            an = j * (b - K);
            
            if (N % b > 0) {
                long x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                long x2 = Math.min(N, (j+1) * b - 1);
                
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            s += an;
        }
        System.out.println(s);
    }
}
```

Just a couple notes about the translation:

1. I used `long` for the variables `s`, `an`, `j`, `x1`, and `x2` instead of `int` to handle the possibility of the intermediate or final results exceeding the `int` range due to arithmetic operations.
2. Remember that in Java, integer division truncates the remainder automatically, so there's no need to use floor division as in Python.
3. You can use the `Scanner` class to read from `System.in` in Java, which is roughly equivalent to reading from `sys.stdin` in Python.
4. The `println` method in Java is used to output a line to the console, serving the role of Python's `print` function.
