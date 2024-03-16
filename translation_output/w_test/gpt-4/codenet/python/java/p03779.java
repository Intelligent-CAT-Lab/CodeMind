Here is the translated Java code that performs the same operation as the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        
        int t = (int)(Math.floor((-1 + Math.sqrt(1 + 8 * (long)x)) / 2));
        
        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}
```

Please note that `Math.sqrt` returns a `double`, so casting is needed. Additionally, I cast the result of `8 * x` to a `long` to avoid potential integer overflow in the case of large `x` input before performing the square root. Finally, integer division takes the place of Python's `//` operator.
