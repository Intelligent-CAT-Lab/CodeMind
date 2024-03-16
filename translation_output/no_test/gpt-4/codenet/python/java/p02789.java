Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a line of input and splitting it by space
        String[] parts = scanner.nextLine().split(" ");

        // Parsing the integers
        int[] a = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }

        // Checking if the first two numbers are equal
        if (a[0] == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Make sure you run this code in an environment where it can accept user input, as it expects to read from the standard input (console).
