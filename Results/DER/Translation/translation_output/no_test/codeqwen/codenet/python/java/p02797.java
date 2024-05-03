Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();

        int[] A = new int[N];
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 1000000000;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N - 1 ? " " : ""));
        }
    }
}
```

Please note that Java does not have a built-in function for joining elements of an array into a string, so I used a for loop to print the elements of the array. Also, Java does not have a built-in function for printing a newline character, so I used the `System.out.println()` function to print a newline after the array.
