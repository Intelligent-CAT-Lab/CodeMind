Below is the equivalent Java code for the provided Python snippet. Note that in Java, you must import the Scanner class for taking input and the code is generally more verbose.

```java
import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int x = scanner.nextInt();

        System.out.println(x * x * x);

        scanner.close(); // Remember to close the scanner to avoid resource leaks.
    }
}
```

To compile and run this Java code, you should save it to a file named `CubeCalculator.java`, then use the `javac` command to compile it, and `java` to run the compiled class:

```
javac CubeCalculator.java
java CubeCalculator
```

When you run the Java program, it will prompt you to enter an integer, similar to the behavior of the provided Python code.
