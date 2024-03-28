Here is the translated code from Python to Java, including a test case with the provided input:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.max(Math.max(a - b, a + b), a * b));
    }
}
```

This Java code does the same thing as the provided Python code: it reads two integers from the input, and then prints the maximum of three calculated values: `a-b`, `a+b`, and `a*b`. 

To test this Java code with the input `-13 3`, you would run the program and enter `-13 3` on the command line when prompted. It should print `41` as the expected output.
