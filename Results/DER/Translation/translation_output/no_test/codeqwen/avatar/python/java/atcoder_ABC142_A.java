Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double) (N + 1) / N / 2);
        }
    }
}
```

In Java, we use `Scanner` to get user input. The `nextInt()` method is used to get an integer input from the user. The `%` operator is used to check if a number is even or odd. If the number is even, we print `0.5`. If the number is odd, we print `(N + 1) / N / 2`. We need to cast `N + 1` to `double` to get a floating point result.
