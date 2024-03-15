Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong(); // instead of 'a' in the Python code
        long b = scanner.nextLong(); // instead of 'b' in the Python code
        int count = 1;
        long x = a;

        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }

        System.out.println(count);

        scanner.close();
    }
}
```

Please note the following when translating from Python to Java:

1. Java is strongly typed, so you have to declare the type of each variable.
2. `input()` in Python is replaced by using a `Scanner` object to read from standard input in Java.
3. In Python, you can assign multiple variables with a tuple-like syntax, but in Java, each variable must be assigned individually.
4. The `map` function behavior is replaced by individual `nextLong` calls on the `Scanner` object to read long integers.
5. Java does not have implicit bounds checking on arithmetic operations (i.e., it won't automatically throw an exception for integer overflow). If dealing with extremely large numbers, consider additional checks or use `BigInteger` for arbitrary-precision arithmetic.
6. Java uses `System.out.println` to print to the console.
7. Java code must be enclosed in a class, and the executable code should be within the `main` method of that class.
8. Remember to close the scanner at the end to avoid resource leaks.
