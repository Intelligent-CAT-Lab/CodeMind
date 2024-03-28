Here's the equivalent Java code for the provided Python script. This code assumes that the input is given as a single line with integers separated by spaces through the standard input (e.g., through the console).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integers from a single line of input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculating the result and printing "Yes" or "No"
        if ((double) a / b <= c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

To test this Java code with the input `1000 15 80`, you would run the program and provide the input in the console when prompted. The expected output would be `"Yes"`, as `1000 / 15 <= 80` is true.
