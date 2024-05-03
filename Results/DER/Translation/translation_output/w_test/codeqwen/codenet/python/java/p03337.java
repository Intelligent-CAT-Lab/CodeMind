Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.max(a + b, Math.max(a - b, a * b)));
    }
}
```

This Java code does the same thing as the Python code: it reads two integers from the user, adds them, subtracts them, multiplies them, and then prints the maximum of these three results. The `Math.max` function is used to find the maximum of two numbers, and it can be used to find the maximum of three numbers by using it twice.
