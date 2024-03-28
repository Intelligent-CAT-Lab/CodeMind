Here is the equivalent Java code for the provided Python code snippet. Note that Java requires more boilerplate code such as defining a class and method signature.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        scanner.close();
    }
}
```

The provided test input was 0, however, the expected output doesn't seem correct according to your Python code. Based on the Python code, if the input is 1, it should print 0, for any other input, it should print 1. If you need to produce an output of -95 when input is 0, you will have to alter the Python code and the corresponding Java code as well. If that's the case, please provide the correct requirement to give you that specific translation.
