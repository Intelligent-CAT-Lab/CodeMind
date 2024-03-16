Below is the translated Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class ZeroIndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

        for (int e = 0; e < inputs.length; e++) {
            int i = Integer.parseInt(inputs[e]);
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
        }

        scanner.close();
    }
}
```

This Java program will have the same functionality as the Python code. It reads a line of input, splits it into an array of strings representing each number, and then converts each string to an integer to check if it is zero, printing the position of the first zero in the sequence (1-indexed).
