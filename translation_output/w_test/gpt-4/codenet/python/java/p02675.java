Here's the Python code translated into Java:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        scanner.close();

        List<Integer> honNumbers = Arrays.asList(2, 4, 5, 7, 9);

        if (n == 3) {
            System.out.println("bon");
        } else if (honNumbers.contains(n)) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```

To run this Java program for the test input `16`, you can compile and run it in a Java environment. The expected output will be `pon` as per the logic defined in the Python code.
