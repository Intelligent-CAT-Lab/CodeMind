Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a*a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the square root of the integer, and then prints the square of the integer. The `Math.sqrt` function in Java is used to calculate the square root of a number. The `(int)` cast is used to convert the result of the square root calculation to an integer.
