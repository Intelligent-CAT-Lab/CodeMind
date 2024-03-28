Below is the Java equivalent of the Python code you have provided. Please note that Java has different ways of handling input/output, especially since it does not use the `readline` function from `sys.stdin`. I've included a basic way to take input from `System.in` using `Scanner`, which is more standard for Java. Also, note that Java's `print` and `println` functions can be used for output.

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();
        
        int[] A = new int[N];
        Arrays.fill(A, S);
        
        if (S == (int) Math.pow(10, 9)) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = (int) Math.pow(10, 9);
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N - 1 ? " " : "\n"));
        }

        scanner.close();
    }
}
```

Please note the following changes:
- The `main` method in Java is declared as `public static void main(String[] args)`.
- The `input` function from Python is replaced with a `Scanner` to read input in Java.
- Instead of `print(' '.join(map(str, A)))` in Python, a for loop is used to print the values of the array `A` in Java, separated by spaces.
- The `INF` constant has been defined as `Integer.MAX_VALUE`, which is the equivalent of Python's `float("inf")` for integer values.
- There is no need for the `sys.setrecursionlimit` call as Java stack size is set differently and not in the code.
- Import statements have been adjusted or removed because they are not used in the translated Java code. Some of those functionalities like `reduce`, `gcd`, `bisect`, and `itertools` are part of Python's standard library but are used differently or are not directly available in Java.

Although this Java code closely replicates the logic of the given Python script, keep in mind that handling command line input/output in a competitive programming environment can vary based on the specific contest platform's requirements.
