Here's the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println((inputNumber / 500) * 500);
        scanner.close();
    }
}
```

This Java program mimics the behavior of the given Python code. It reads an integer from the standard input, then performs integer division by 500, multiplies the result back by 500, and prints it out. Java inherently performs integer division when dividing two integers, so there's no need to explicitly floor the division as is done in Python using `//`.
