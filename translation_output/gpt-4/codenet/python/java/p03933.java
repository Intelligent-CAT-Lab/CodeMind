Below is the translated Java code from the provided Python code. In Java, there isn't an exact equivalent to Python's simplicity when dealing with dynamically sized arrays and mathematical functions, but I have used classes like `java.util.Scanner` for input and `java.io.BufferedInputStream` for efficient I/O, along with the `Math` class for trigonometric operations. 

Please note that Java is a statically typed language, so ensure all necessary type conversions are handled correctly.

```java
import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static double pi = Math.PI;
    
    public static boolean test(int N, long K, double x) {
        double theta = pi/N;
        long cnt = 0;
        for (int A = 1; A <= N - 2; A++) {
            double sA = sin(A * theta);
            double diff = acos(Math.max(-1.0, Math.min(1.0, x/sA - cos(A*theta)))) / theta;
            if (Double.isNaN(diff)) {
                diff = -2 * N;
            }
            int upper = Math.min(N - A - 1, (int) ((N - A + diff) / 2));
            int lower = (N - A) - upper;
            cnt += Math.max(0, upper - lower + 1);
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in, 1024 * 8));
        int N = sc.nextInt();
        long K = sc.nextLong();
        
        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(N, K, x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
        
        sc.close();
    }
}
```

Note a few things about the translated Java code:

1. In Java, the equivalent of Python's `math.sin` and `math.cos` are `Math.sin` and `Math.cos`, respectively. `Math.acos` is used for the arc cosine function.
2. Floating-point numbers by default are double precision in Java, so `Math.sin` and other operations return `double` values, no need to explicitly declare single precision as you would by saying `np.sin` in Python.
3. `java.io.BufferedInputStream` is used along with `java.util.Scanner` for more efficient input.
4. Java does not have a built-in NaN check like in Python. Instead, `Double.isNaN()` is used to check if a value is NaN.
5. Array manipulation in Java is more verbose and less powerful than in programming languages designed for numerical computing like Python with NumPy. However, since the original code works with simple loops, the conversion is straightforward.
6. To simplify the code, I've omitted explicit exception handling; however, in a production environment, you might want to add proper try-catch blocks.

Remember that, for running this program, you should put this `Main` class in a file named `Main.java` and compile it with `javac Main.java` followed by `java Main` to run it, providing the input in the way the original Python script expects.
