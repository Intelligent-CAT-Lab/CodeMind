Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        double hen = L / 3.0;
        System.out.println(Math.pow(hen, 3));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, divides it by 3, and then prints the cube of the result. The `Math.pow` function is used to calculate the cube of a number in Java. The `/` operator in Java performs integer division, so we need to use `/ 3.0` to get a floating-point result.
