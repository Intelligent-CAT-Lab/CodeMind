Here is the equivalent Java code that performs the same functionality as the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int result = 1 - inputNumber;
        System.out.println(result);
    }
}
```

The above Java code reads an integer from the standard input, subtracts it from 1 and then prints the result. Note that a `Scanner` object is used to read the input in Java. Also, in Java, you need to define a class and a `main` method as the entry point for the application.
