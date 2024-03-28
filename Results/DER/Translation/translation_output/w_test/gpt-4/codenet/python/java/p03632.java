Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class OverlappingInterval {
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
        
        scanner.close();
    }
}
```

This Java program achieves the same functionality as the provided Python code. The user is asked to input four integers, which are then used to calculate the overlapping length between two intervals. The result is printed to the console. Remember to import `java.util.Scanner` for user input and close the scanner after use to avoid potential resource leaks.
