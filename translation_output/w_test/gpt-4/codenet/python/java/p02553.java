Of course! I'll translate the provided Python code to Java. The Java code will perform the same functionality: read four integers from the standard input, calculate the maximum product, and print it out.

Here is the equivalent Java code:

```java
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        long ans = Long.MIN_VALUE; // Using long to match the large negative value in the Python code
        ans = Math.max(ans, (long) a * c);
        ans = Math.max(ans, (long) a * d);
        ans = Math.max(ans, (long) b * c);
        ans = Math.max(ans, (long) b * d);
        
        System.out.println(ans);
        scanner.close();
    }
}
```

To compile and run the Java code, save it to a file named `MaxProduct.java`, then use the commands `javac MaxProduct.java` to compile, and `java MaxProduct` to run the program. When running, provide the test input ("1 2 1 1") to get the expected output which is "2".
