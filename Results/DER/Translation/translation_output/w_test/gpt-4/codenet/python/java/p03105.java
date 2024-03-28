Here is the equivalent Java code for the provided Python code. I've also encapsulated it in a main method, so it could run as a standalone Java application. Note that Java has a different way of taking input, typicallty using a `Scanner` object, and requires more verbose variable declaration and type specification.

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```

This Java code will read three integers from the standard input, similar to what the Python code does, and then perform the same logic to print the correct number according to the input.
