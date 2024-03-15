Here is the translated code from Python to Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        int a = (int) Math.ceil(C / A);

        double s = 7 * A + B;
        double t = Math.floor(C / s);
        
        double u = C - s * t;
        
        int v = (int) Math.ceil(u / A);

        int b;
        if (v <= 7) {
            b = (int)(7 * t + v);
        } else {
            b = (int)(7 * t + 7);
        }
        
        int result = (a > b) ? b : a;
        System.out.println(result);
        scanner.close();
    }
}
```

Notes:
- Java requires explicit type casting because it is statically typed compared to Python which is dynamically typed. Therefore, I used `(int)` for explicit casting of `double` values to `int` when necessary.
- I used `Math.floor` in place of Python’s floor division `//` operator.
- The input part is managed by `Scanner` which reads `double` values from the standard input.
- I defined this code inside a `Main` class with a `main` method, which is the entry point of a Java program.
- You need to add necessary error handling such as when the input is not as expected – my code assumes that input is always correctly formatted.
