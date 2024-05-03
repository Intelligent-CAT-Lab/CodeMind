Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(String.valueOf(a*a));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the square root of the number, and then prints the square of the integer part of the square root.
