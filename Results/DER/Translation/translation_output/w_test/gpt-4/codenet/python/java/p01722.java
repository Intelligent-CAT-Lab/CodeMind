Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n == 0 ? 1 : 2 / n);
    }
}
```

This Java code will read an integer from the standard input, and if the input is 0, it will print `1`. Otherwise, it will attempt to calculate `2 / n` and print the result. Keep in mind, if `n` is not equal to zero, and it doesn't evenly divide `2`, the result will be `0` due to integer division in Java. If you expect a non-integer result, you would have to use a different data type like `double` for `n` and cast the literal `2` to `double` as well.
