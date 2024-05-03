Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        double hen = L / 3;
        System.out.println(Math.pow(hen, 3));
    }
}
```

This Java code does the same thing as your Python code. It reads a double value from the user, divides it by 3, and then prints the cube of the result. The `Math.pow` function is used to calculate the cube of a number in Java.
