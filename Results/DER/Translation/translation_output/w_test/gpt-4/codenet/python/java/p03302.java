Certainly! Below is the provided Python code translated into Java. I've also included a sample main method to handle the input and produce the expected output:

```java
import java.util.Scanner;

public class ArithmeticChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a + b == 15) {
            System.out.println('+');
        } else if (a * b == 15) {
            System.out.println('*');
        } else {
            System.out.println('x');
        }
        
        scanner.close();
    }
}
```

You can run this code, and providing an input of `4 11` would print a `+` as expected.
