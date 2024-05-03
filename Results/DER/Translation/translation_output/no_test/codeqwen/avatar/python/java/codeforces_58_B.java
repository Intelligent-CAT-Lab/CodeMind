Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `for` loop is similar to the Python code, but we use `i--` instead of `-= 1` to decrement `i` by 1 each time. The `System.out.print` statement is used to print the factors of `a`, and we use a space character as the separator.
