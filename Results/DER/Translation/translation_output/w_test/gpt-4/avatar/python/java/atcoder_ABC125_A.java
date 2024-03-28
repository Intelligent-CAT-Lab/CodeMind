Below is the Java translation of the given Python code. The Java code includes a simple scanner to read inputs and then performs the calculations according to the logic provided.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        
        int ans = (T / A) * B;
        
        System.out.println(ans);
        
        scanner.close();
    }
}
```

To run a Java program with the test input "20 20 19", you would compile this code and run it, then enter the input when prompted. The expected output for this input will be 0, just as specified.
