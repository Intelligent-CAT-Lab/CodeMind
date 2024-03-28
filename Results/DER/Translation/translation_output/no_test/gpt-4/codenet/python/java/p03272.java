Below is the Java equivalent of your Python code. The Java version is more verbose because Java is a statically-typed language that requires explicit variable declarations and doesn't support tuple assignment as Python does.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = scanner.nextInt();
        
        System.out.println(n + 1 - i);

        scanner.close();
    }
}
```
The above Java code uses the `Scanner` class for input, similar to the `input()` function in Python. It reads two integers, `n` and `i`, and then prints `n + 1 - i` to the console.
