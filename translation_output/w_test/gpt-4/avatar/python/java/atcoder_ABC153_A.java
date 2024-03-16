Below is the translated code from Python to Java, along with a simple main method to accept input from the console and produce the expected output:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int result = (int)Math.ceil((double)h / a);

        System.out.println(result);
        scanner.close();
    }
}
```

The above Java code will replicate the behavior of the provided Python code. It reads two integers from the console, calculates the ceiling of their division, and prints the result. Remember to handle input and output in a way that's consistent with your runtime environment.
