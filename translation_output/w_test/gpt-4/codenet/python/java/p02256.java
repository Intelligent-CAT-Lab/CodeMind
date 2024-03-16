Certainly! Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        
        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        
        System.out.println(y);
    }
}
```

This Java code does the same as the Python code: It reads two integers, ensures that x is not greater than y, and then uses the Euclidean algorithm to find the greatest common divisor (GCD). Finally, it prints out the GCD. 

The code assumes that you would compile and execute this using the Java SDK and that you will provide the input "54 20" when prompted after executing the program. The expected output, as with the Python code, would be "2".
