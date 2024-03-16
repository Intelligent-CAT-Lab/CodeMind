Here's the equivalent Java code for the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] rdi() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        return new int[]{
                Integer.parseInt(tokenizer.nextToken()),
                Integer.parseInt(tokenizer.nextToken())};
    }

    public static void main(String[] args) throws IOException {
        int[] input = rdi();
        int N = input[0];
        int K = input[1];

        long s = 0;
        for (int b = K + 1; b <= N; b++) {
            long an = 0;
            long j = N / b;
            an = j * (b - K);
            if (N % b > 0) {
                long x1 = j * b + K;
                if (K == 0) {
                    x1 += 1;
                }
                long x2 = Math.min(N, (j + 1) * b - 1);
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

Explanation of changes:

1. Replaced the input mechanism with `BufferedReader` and `StringTokenizer` for Java, which are common ways to read inputs in Java.
2. Changed the syntax of function declarations to reflect Java syntax and types.
3. In Java, we must define the class (`Main` in this case) and place the `main` method within it, which serves as the entry point to the program.
4. Utilized `int[]` for the return type of `rdi()` since Java does not have a tuple return syntax like Python's multiple assignment.
5. As Java is strongly typed, we declare types for every variable explicitly.
6. Changed the print statement to use `System.out.println`.
7. Used `long` for the summation variable `s` and others involved in the calculation to prevent potential overflows with larger input values.

Remember that Java does not natively support Python's slicing syntax. Whenever you deal with similar requirements in Java, you must use methods like `Math.min()` or calculate the indices explicitly.

For the sake of the demonstration, the given Java code expects to receive input exactly once, immediately when it runs. If you wish to run multiple test cases, you would need to loop over the input process, which is not shown here.
