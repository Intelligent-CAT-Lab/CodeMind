Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println((a - k) + " " + b);
            System.exit(0);
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```

To test this code as per the test input provided (2 3 3):

Compile and run the program, input `2 3 3` followed by the Enter key when prompted, and expect the output `1 76`.

Please note that the provided expected output `1 76` does not match the logic of the code, as for the input `2 3 3`, the expected output according to the code logic should be `0 0`.

If `1 76` is the expected output for some other test input, you will need to provide the corresponding input for which this output is expected.

Here is the Java code again, correctly formatted to be used in your Java environment:

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println((a - k) + " " + b);
            System.exit(0);
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```
