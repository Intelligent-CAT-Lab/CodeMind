Here's the provided Python code translated into Java:

```java
import java.util.Scanner;

public class HappinessCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Initialize answer
        int ans = 0;

        // Calculate happiness for 'a'
        ans += 1 * (Math.min(a, k));
        k -= Math.min(a, k);

        // Happiness for 'b' doesn't change anything as its multiple is 0
        k -= Math.min(b, k);

        // Calculate happiness for 'c'
        ans += (-1) * (Math.min(c, k));
        k -= Math.min(c, k);
   
        // Print the answer
        System.out.println(ans);
        
        // Close the scanner
        scanner.close();
    }
}
```

Here's a sample test case with the example input provided:

Test input:
```
2 1 1 3
```

Expected output:
```
21
```

Since Java is more verbose than Python, the above Java code includes necessary imports, scanner object for reading input from the terminal, and class/method definitions. Make sure to compile and run this Java program with a Java Runtime Environment to test the given inputs.
