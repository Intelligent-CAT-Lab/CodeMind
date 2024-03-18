Here is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```

This Java code performs the same logic as the provided Python code. It reads three integers from standard input, checks the condition, and prints the result to standard output.

To compile and run this Java code, save it as `Main.java`, and use the Java compiler and runtime as follows:

```sh
javac Main.java
java Main
```

Provide the test input specified (e.g., `2 11 4`) to have the expected output (`-79`) returned. Note that for the given test input, the expected output would actually be `5`, instead of `-79`, assuming there's no typo in the expected output.
