Certainly! Below is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }

        scanner.close();
    }
}
```

The Java program has a similar structure to the Python code. It includes a `main` method, which is the entry point of the program. It uses `Scanner` to read the integer input from the user and then checks the condition to decide which string to print.
