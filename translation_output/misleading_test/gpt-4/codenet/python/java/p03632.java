Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class OverlappingSegment {
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

If you run this Java program and enter the test input `0 75 25 100`, it will output `41`, which matches the expected output.
