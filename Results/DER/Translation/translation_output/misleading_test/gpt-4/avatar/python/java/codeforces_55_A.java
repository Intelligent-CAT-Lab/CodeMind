Below is the equivalent Java code that fulfills the purpose of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input
        int n = scanner.nextInt();

        // Loop to divide by 2 while number is even
        while (n % 2 == 0) {
            n /= 2;
        }

        // Check if the resulting number is 1
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
```

To run a sample test case with the input `512`, you can run the program and provide the input when prompted. The program will print `YES` to the console as expected.
