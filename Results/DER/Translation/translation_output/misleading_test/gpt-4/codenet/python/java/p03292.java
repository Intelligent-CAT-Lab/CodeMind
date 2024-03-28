Here is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = scanner.nextInt();
        }

        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);
        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);

        System.out.println(Math.min(Math.min(b, c), d));
    }
}
```

You would run this Java program and provide the input in the same way as the test case example (e.g., "1 6 3", followed by pressing Enter). The expected output would be printed to the console, which should be 67 for this test case.
