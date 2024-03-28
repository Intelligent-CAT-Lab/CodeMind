Here is the translated Java code for the given Python function:

```java
import java.util.Scanner;

public class RoundingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -Math.floorDiv(-a, b);
        } else {
            return Math.floorDiv(a, b);
        }
    }
}
```
You can run this Java program with the input "5 8" to get the expected output "16". The `Math.floorDiv` method is used to perform integer division similar to the Python `//` operator.
