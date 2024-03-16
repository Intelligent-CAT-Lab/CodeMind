Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int x = a;
        int h = 0;
        int s = 0;

        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }

        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }

        System.out.println(h);
    }
}
```
This Java program mimics the behavior of the provided Python code. It reads two integers from `System.in`, runs loops corresponding to the ones in the Python code, and finally outputs the value of `h`. Just like the original Python code, it does not include input prompts or error handling, which would be appropriate for production-quality code.
