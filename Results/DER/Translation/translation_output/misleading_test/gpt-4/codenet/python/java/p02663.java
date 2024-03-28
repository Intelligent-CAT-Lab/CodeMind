Here is the equivalent Java code for the provided Python script. The Java code gets the input through a Scanner, and uses basic arithmetic operations to calculate the difference in time, considering the given input variables.

```java
import java.util.Scanner;

public class TimeDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Calculate time in minutes from beginning of the day
        int t1 = 60 * h1 + m1;
        int t2 = 60 * h2 + m2;
        
        // Output the difference in time minus k
        System.out.println(t2 - t1 - k);
        
        scanner.close();
    }
}
```

To use this Java program, compile it and then run the compiled Bytecode. When prompted, provide the input as a space-separated list of numbers just like the test input (e.g., "10 0 15 0 30") and it will output the expected result (e.g., "276").
