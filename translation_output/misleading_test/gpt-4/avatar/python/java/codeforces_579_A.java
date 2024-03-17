Here is the translated code from Python to Java. Please note that in Java, we need to import the `Math` library, and we need a main method for our code to run. I am also adding a Scanner instance to read input from the user, similar to the `input()` function in Python.

```java
import java.util.Scanner;
import java.lang.Math;

public class LogarithmCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;

        while ((Math.log(n) / Math.log(2)) % 1 != 0) {
            x++;
            n -= Math.pow(2, (int) (Math.log(n) / Math.log(2)));
        }

        System.out.println(x);
        scanner.close();
    }
}
```

To run the test case with the input `9`, you would compile and execute this Java program, and then input `9` when prompted. The expected output would be `-12`. However, there must be a mistake in your provided code or your expected output, as the logic in the original Python code won't produce an output of `-12` for an input of `9`. Instead, it will terminate with a value of `5` for `x`. If that is your intention, then the Java code above will work as expected for the Python code given.
