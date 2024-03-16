Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }

        scanner.close();
    }
}
```

Keep in mind that when you run the Java program, you need to provide the input in the same format as the test case; however, unlike the Python version, Java requires explicit data type declarations, input handling, and does not have tuple assignment.

You can compile and run this Java program using the following commands in a terminal (assuming you have Java JDK installed and the file is named `Main.java`):

```sh
javac Main.java
java Main
```

Then enter your test input: `4 3 6`, and you should receive the expected output: `safe`.
