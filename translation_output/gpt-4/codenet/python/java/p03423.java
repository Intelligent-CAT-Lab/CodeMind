Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class DivisionByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number / 3);
        scanner.close();
    }
}
```

In this Java code, we use a `Scanner` to read input from the user, just like `input()` in Python. We then parse that input to an integer (since `Scanner.nextLine()` returns a `String`) and perform integer division by 3, similar to `//` in Python. Finally, we print out the result.
