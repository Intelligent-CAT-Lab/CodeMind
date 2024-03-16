Below is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class SumWithoutMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        int max = Math.max(a, Math.max(b, c));
        int sumWithoutMax = a + b + c - max;
        
        System.out.println(sumWithoutMax);
        
        scanner.close();
    }
}
```

This Java program mimics the functionality of the provided Python code. It reads a line of input, splits it into three parts, converts those parts into integers, calculates the sum of the three integers minus the maximum integer, and prints the result. Make sure to provide inputs in a single line when prompted, just like in the provided test case `1 3 4`.
