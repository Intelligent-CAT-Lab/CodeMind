Sure, here's the Python code translated to Java:

```java
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        
        for (int j = 1; j <= n; j++) {
            k *= j;
        }

        System.out.println(k);
        
        scanner.close();
    }
}
```

To use this Java code, you would compile it and then execute the compiled class providing an integer input when prompted, just like in the Python code.

To test input 5, you would run the Java program, enter `5` when prompted, and expect the output `120`. There is a discrepancy in your expected output (`215`), but assuming this is a typo, the correct output for the factorial of 5 would indeed be `120`.
