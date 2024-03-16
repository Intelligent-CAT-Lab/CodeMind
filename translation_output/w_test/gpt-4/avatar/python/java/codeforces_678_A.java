Below is the Java equivalent of your provided Python code. The Java version requires a bit more structure, such as imports for input handling, a class definition, and a main method.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers
        long vamshi = scanner.nextLong();
        long z = scanner.nextLong();
        
        // Compute and output the result
        long result = (vamshi / z + 1) * z;
        System.out.println(result);
        
        scanner.close();
    }
}
```

When you run this Java program, you can input "999999999 1" (without quotes) on the command line, and the program will output "1000000000", as expected according to your test case.
