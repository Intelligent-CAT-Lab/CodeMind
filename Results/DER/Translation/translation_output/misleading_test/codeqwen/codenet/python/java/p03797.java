Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then checks if the first integer is less than or equal to twice the second integer. If it is, it performs the calculation and prints the result. If it isn't, it simply prints the second integer divided by 2.
