Here is the equivalent Java code for the provided Python code. Please note that Java code is more verbose and requires defining the types of all variables and the size of arrays.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int t = Integer.parseInt(inputs[2]);

        System.out.println((t / a) * b);

        scanner.close();
    }
}
```

This code will behave similarly to the Python code for a given input. Make sure to provide the input in the same format as the Python code expects to match the test case scenario: "3 5 7".

You can compile and run this Java program, and it should give the expected output `10` for the given input.
