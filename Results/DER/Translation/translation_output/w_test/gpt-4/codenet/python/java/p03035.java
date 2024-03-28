Below is the translated Python code into Java. It assumes that the input is provided in the same format as the test case (e.g. "30 100") and uses a Scanner to read from `System.in`. The program then performs the same checks and outputs the appropriate value based on the age `A`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A >= 13) {
            System.out.println(B);
        } else if (A >= 6 && A <= 12) {
            System.out.println(B / 2);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
```

To execute the program, you are supposed to have a Java environment set up correctly (JDK installed), compile the `Main.java` file with `javac Main.java`, and run it with `java Main`, providing the test input when prompted.
