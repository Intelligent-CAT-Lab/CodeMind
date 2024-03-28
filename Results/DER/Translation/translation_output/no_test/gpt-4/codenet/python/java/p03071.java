Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from user input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculate values based on A and B
        int sum = A + B;
        int doubleAminusOne = 2 * A - 1;
        int doubleBminusOne = 2 * B - 1;
        
        // Find the maximum value among the calculated values
        int maxVal = Math.max(Math.max(sum, doubleAminusOne), doubleBminusOne);

        // Print the maximum value
        System.out.println(maxVal);

        scanner.close();
    }
}
```

This Java code will take two integers as input, calculate three different expressions using these integers, and finally print out the maximum of the three calculated values. Note that in Java, you would typically place this inside a class and use the `Scanner` class to handle input. The `Math.max` method is used to find the maximum value.
