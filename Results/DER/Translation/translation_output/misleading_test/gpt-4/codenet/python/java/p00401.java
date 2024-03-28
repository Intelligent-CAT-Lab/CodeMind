Here's the Java translation of your Python code, along with the sample test case as comments:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sample test case
        // Test input: 54
        // Expected output: 33

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println((int) Math.round((double) count / 2));
    }
}
```

To use the above code, you'll need to have a Java environment set up on your machine or use an online Java compiler or IDE. You can input your test value (e.g., 54) into the program by typing it into the console when prompted.
