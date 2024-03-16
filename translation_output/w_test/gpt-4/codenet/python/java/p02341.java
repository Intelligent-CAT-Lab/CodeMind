Certainly! Below is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(n <= k ? 1 : 0);
        scanner.close();
    }
}
```

Here's how you would compile and run this Java code:

1. Save the code to a file named `Main.java`.
2. Compile the code using the `javac Main.java` command in your terminal.
3. Run the compiled class with `java Main`, and then input `5 10` when prompted.
4. It should output `1` as expected based on the test case provided.
