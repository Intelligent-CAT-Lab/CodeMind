Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the three integers from the input line.
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (n >= 2) {
            if (b >= a) {
                System.out.println((long)(n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}
```
I have used a `Scanner` to read the input from `System.in`. Note that in Java, we explicitly need to close the scanner to release any resources it may be using after we're done with it. Also, I've cast the result of the multiplication `(n - 2) * (b - a)` to a `long` type to prevent any potential integer overflow if `n`, `a`, and `b` are large.
