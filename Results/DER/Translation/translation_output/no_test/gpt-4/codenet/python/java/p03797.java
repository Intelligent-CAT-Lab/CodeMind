Here is the equivalent Java code for the Python snippet you provided:
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

        scanner.close();
    }
}
```
This Java code reads two integers `s` and `c`, and then checks the same condition as the Python code, printing the result accordingly. In Java, input is typically taken using a `Scanner`, and output is done using `System.out.println`.
