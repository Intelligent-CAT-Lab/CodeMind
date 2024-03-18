Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

To run the test case with input "2 2 2," you would run the `EqualityCheck` class and provide the input. The expected output would then be "Yes," assuming that the input is provided as a single line with the values separated by spaces.
