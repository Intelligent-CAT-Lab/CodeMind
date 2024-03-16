The equivalent Java code to achieve the same result would look something like this:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String x = scanner.next();
        String C = scanner.next();
        System.out.println("A" + x.charAt(0) + "C");
    }
}
```
This Java program also reads from standard input and outputs the abbreviated form similar to the provided Python code. Please note that the `Scanner` class is used to parse the input in Java, and the `charAt` method is used to access the first character of the string `x`.
