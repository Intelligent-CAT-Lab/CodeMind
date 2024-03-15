Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2, 4));

        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }

        scanner.close();
    }
}
```

Important notes about the code translation:
- The `input()` function in Python is replaced with Java's `Scanner` class to read input from the user.
- In Python, you can concatenate strings and slice them easily with `+` and `[]` respectively. In Java, you must convert from `String` to `int` using `Integer.parseInt()` and use `substring()` for slicing.
- The `print` function in Python is replaced with `System.out.println` in Java for printing output to the console.
- Java is a statically typed language, so all variables need to be declared with a data type.
- Java uses `&&` for logical AND as compared to Python's `and` operator.
