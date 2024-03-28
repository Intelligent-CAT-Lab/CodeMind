Here's the equivalent Java code for the provided Python snippet. Note that in Java, we need to include the necessary imports and the code must be enclosed within a class. Additionally, Java requires more explicit type declarations and doesn't have built-in functions like `min` or `max` for multiple integers, so we'll use `Math.min` and `Math.max` instead.

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculating and printing the results
        System.out.print(Math.min(A, B) + " ");
        System.out.println(Math.max(A + B - N, 0));
        
        scanner.close();
    }
}
```

Remember that running this Java program will require a Java environment with at least the corresponding version compatible with the `Scanner` class (which has been available since Java 1.5). This program should perform the same task as the provided Python code, taking three integers from the user and outputting two results based on the `min` and `max` functions.
