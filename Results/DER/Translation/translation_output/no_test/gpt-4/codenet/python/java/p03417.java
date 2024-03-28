Certainly! Here's a Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (Math.max(N, M) == 1) {
            System.out.println(1);
        } else if (Math.min(N, M) == 1) {
            System.out.println(N * M - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
        
        scanner.close();
    }
}
```

This Java code takes two integers as input, just like the Python version. It then checks the conditions using `Math.max()` and `Math.min()` for the maximum and minimum values, respectively, and prints out the result based on the same conditions as the Python code.
