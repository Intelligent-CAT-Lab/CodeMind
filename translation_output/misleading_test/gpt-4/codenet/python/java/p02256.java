Sure, below is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
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

This Java program will produce the expected output when given the test input "54 20". It correctly implements the Euclidean algorithm to find the greatest common divisor (GCD) of two numbers as given in the original Python code.
