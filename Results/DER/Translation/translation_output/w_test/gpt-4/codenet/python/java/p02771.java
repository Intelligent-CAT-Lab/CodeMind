Here's the equivalent Java code for the given Python program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java program does what the Python snippet does:
1. Read three integers from the standard input.
2. Check if exactly two out of the three integers are equal and the third is different.
3. Print "Yes" if the above condition is true, otherwise print "No".

To use this code, you'd compile it and run it in a Java execution environment, then input the numbers separated by spaces as required.
