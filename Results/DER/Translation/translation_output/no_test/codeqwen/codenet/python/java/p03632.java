Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        int ans = Math.min(B, D) - Math.max(A, C);
        
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the minimum of the second and fourth integers minus the maximum of the first and third integers, and prints the result. If the result is greater than 0, it prints the result; otherwise, it prints 0.
