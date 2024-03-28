Here's the equivalent Java code for the provided Python code. The Java code reads two integers from the standard input, calculates the ceiling of their division, and prints the result.

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int result = (int) Math.ceil((double) H / A);
        System.out.println(result);
    }
}
```

For the given test input "10 4", if you run this Java program and enter the input when prompted, it will output "3" as expected.
