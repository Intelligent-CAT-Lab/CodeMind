Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

When you run this Java program, you will need to enter an integer (in this case, `1000`), and it will print out `ABC` if the number is less than `1200`, otherwise it will print out `ARC`.

While Python uses dynamic typing and has a powerful inline conditional expression, Java is more explicit with types and uses a standard if-else statement. The `Scanner` class in Java is used for obtaining the input of the primitive types like int, double, etc., and strings.
