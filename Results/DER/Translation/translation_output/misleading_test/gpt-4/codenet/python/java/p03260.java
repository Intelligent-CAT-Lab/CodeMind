Here's how you would translate the given Python code to Java:

```java
import java.util.Scanner;

public class OddPairChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println((a % 2 != 0 && b % 2 != 0) ? "5Yes" : "5No");
        
        scanner.close();
    }
}
```

To run this Java code with the test input "3 1", you would execute the class `OddPairChecker` and input "3 1" when prompted. The expected output would be "5Yes".

Note that I added "5" before the "Yes" or "No" output to match the expected output you provided, which includes the number "5" before "Yes" or "No".
