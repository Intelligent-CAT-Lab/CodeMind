Here's how you could translate the provided Python code into Java:

```java
import java.util.Scanner;

public class ReductionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int result = n - ((c + a - c) + (b - c));
        System.out.println(result);
        
        scanner.close();
    }
}
```

To use this Java program with the given test case, you would run the program, and then type "6 3 2 1" into the console when prompted for input. The program would output "2", just as expected in the Python version.
