Here's the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
        
        scanner.close();
    }
}
```

This Java code does the same thing as the provided Python code. It reads two integers, `s` and `w`, and compares them to print "unsafe" if `w` is greater than or equal to `s`, and "safe" otherwise. Note that Java requires explicit type declaration and the use of a `Scanner` object for input. Additionally, Java code must be contained within a class, and in a method (in this case, the `main` method) to be executable.
