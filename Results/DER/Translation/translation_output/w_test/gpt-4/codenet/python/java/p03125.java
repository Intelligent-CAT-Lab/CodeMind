Here's the equivalent Java code for the provided Python code. We'll need to use a `Scanner` to get the input from the user, and we'll create a simple program with the `main` method to process it:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }

        scanner.close();
    }
}
```

To compile and run the Java program with the test input "4 12" (you would type this in after running the program to give the input), you would get the expected output "16".
