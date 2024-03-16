Here's the Java equivalent of the provided Python code, using a Scanner to read input from the console, and then performing the calculation:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((n - 1) * (m - 1));
        scanner.close();
    }
}
```

Here's how you would run this code with the test input "3 4":

1. Save the code in a file named `Main.java`.
2. Compile the code with `javac Main.java`.
3. Run the compiled class with `java Main`.
4. Input "3 4" when prompted.
5. The program will output "6", which is the expected output.
