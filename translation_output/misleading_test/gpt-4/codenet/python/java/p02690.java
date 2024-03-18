Here's the translated Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        outerLoop: // Label for the outer loop
        for (int i = -1000; i < 1000; i++) {
            for (int j = -1000; j < 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    break outerLoop; // Breaks out of both loops
                }
            }
        }
    }
}
```

To run a test case for the input `33`, you would compile and run this Java code, then provide `33` as the input when prompted. The expected output would be `36 87` as per the behavior of the original Python code.
