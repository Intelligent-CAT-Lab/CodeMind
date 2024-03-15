Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int anti = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        
        if (anti == c) {
            System.out.println((anti + m) + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
        
        scanner.close();
    }
}
```

Make sure to include appropriate imports when using `Scanner`. Also, I assumed the intention of your Python code was to perform a kind of rectangle calculation based on the points (anti, b) and (c, d), and output a modified rectangle or -1 based on certain conditions. The Java code replicates that same logic.
