Here is the equivalent Java code for the given Python script. We use a Scanner object to read the input, then perform the even and odd calculations, and finally print out the result.

```java
import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the two integers
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Calculating the sum of even and odd pairs
        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;
        
        // Printing the result
        System.out.println(even + odd);
        
        scanner.close();
    }
}
```

To test this code with the input `2 1`, you would run the program and enter the numbers when prompted. The expected output is `73`.
