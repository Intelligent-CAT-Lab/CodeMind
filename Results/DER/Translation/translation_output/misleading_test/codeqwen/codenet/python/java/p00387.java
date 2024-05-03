Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi = kimawasi + 1;
        }
        System.out.println(kimawasi);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs the division and modulus operations, and then prints the result.
