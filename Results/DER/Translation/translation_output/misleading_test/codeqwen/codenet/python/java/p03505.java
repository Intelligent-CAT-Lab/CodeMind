Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            System.out.println(1 - (int) (- (K-A) / (A-B))*2);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then checks if the conditions are met to print -1, 1, or the result of the calculation.
