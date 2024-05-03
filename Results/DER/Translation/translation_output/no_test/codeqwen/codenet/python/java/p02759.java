Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = (n + 1) / 2.0;
        System.out.println((int) a);
    }
}
```

In Java, we use `Scanner` to get user input. The `nextInt()` method is used to get an integer input from the user. The `double` data type is used to perform the division operation, because Java does not support integer division. After the division, we cast the result to an `int` using the `(int)` operator to get the integer part of the result.
