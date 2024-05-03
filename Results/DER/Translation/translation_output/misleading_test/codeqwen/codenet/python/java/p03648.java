Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        StringBuilder ans = new StringBuilder();
        for (int i = 50 - b; i < 50; i++) {
            ans.append(a + i).append(" ");
        }
        for (int i = 0; i < b; i++) {
            ans.append(a + 50 - b + i + 1).append(" ");
        }
        System.out.println(ans.toString().trim());
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, prints 50, calculates the quotient and remainder when dividing the input by 50, and then prints the numbers from the quotient to the quotient plus 49 (inclusive) and then from the quotient plus 50 minus the remainder to the quotient plus 50 (inclusive). The numbers are separated by spaces. The `StringBuilder` class is used to efficiently build the string of numbers. The `trim()` method is used to remove any trailing spaces from the string before printing it.
