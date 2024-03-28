I have converted the Python script to Java, as requested. Below is the translated code to Java:

```java
import java.util.Scanner;

public class Main {
    private static final int INF = 1000000009; // replaced float INF with integer INF

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int S = in.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S; // Fill the array with S
        }

        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = INF;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N-1 ? " " : "\n"));
        }

        in.close();
    }
}
```

Please note a few key differences I've adopted in the translation:

- The `float("inf")` in Python was replaced with an integer value for INF as Java does not handle infinity in integers in the same way. 
- Java does not have a direct equivalent for Python's `input`, so I have replaced it with Java's `Scanner` for user input.
- In the `print` line, I've added conditionals to ensure that there is a space after each number except the last one, upon which we print a newline.
- I've used a static final variable for `INF` (which is greater than 10^9 to avoid confusion with possible valid S) as Java best practices recommend symbolic constants to be defined this way.

To run this code, you would need to paste this into a file named `Main.java` and compile it with `javac Main.java` and then run it with `java Main` in a console or command line. 

Please note that for a proper Java test, you would need either to redirect the test input to standard input or replace the `Scanner` with predefined values within the code.
