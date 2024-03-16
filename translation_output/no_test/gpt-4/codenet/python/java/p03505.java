Here is the translated Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if(A <= B && K > A) {
            System.out.println(-1);
        } else if(A >= K) {
            System.out.println(1);
        } else {
            // Using Math.floorDiv for flooring division as in Python's //
            int jumps = 1 + Math.floorDiv(K - A, A - B) * 2;
            System.out.println(jumps);
        }
        
        scanner.close();
    }
}
```

Make sure to encapsulate this in a class and use `Scanner` for input handling in Java. The `Math.floorDiv` method is used to replicate Python's flooring division operator `//`. Note that `Math.floorDiv` applies the floor operation only when the result is negative, which matches the behavior of Python's `//`.
