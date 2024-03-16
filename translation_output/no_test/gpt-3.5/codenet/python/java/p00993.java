```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int factorial = IntStream.rangeClosed(1, 1500)
                .reduce((x, y) -> x * y)
                .orElse(1);

        System.out.println(factorial + 2);

        int input = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= input; i++) {
            System.out.println(i + 1);
        }
    }
}
```
