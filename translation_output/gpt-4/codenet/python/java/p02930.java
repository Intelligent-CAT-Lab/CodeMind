Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class BitwiseXORCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = i ^ j;
                int ct = 0;
                while (x > 0) {
                    x /= 2;
                    ct++;
                }
                System.out.print(ct + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
```

Make sure to run the code inside a class definition and include the necessary imports. In this case, I've created a class named `BitwiseXORCount` containing a `main` method. Java requires a main method as an entry point for program execution.

Remember to provide the user with a prompt using `System.out.println` to enter the number `n`, similar to how the Python code uses `input()` to prompt the user. Then, use a `Scanner` object to read the integer input from the user.

Note: Unlike in Python, Java does not use `end=" "` to keep the cursor on the same line after printing. Instead, you use `System.out.print` to print without adding a newline. `System.out.println` is used to include the newline after the inner loop iterations are complete.
