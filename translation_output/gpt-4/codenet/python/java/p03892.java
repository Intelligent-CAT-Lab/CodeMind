Certainly! Below is the Java translation of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        
        int h = Math.abs(b - d);
        int w = Math.abs(c - a);
        if (h == 0 || w == 0) {
            System.out.println(0);
            return;
        }
        
        int m = gcd(Math.max(h, w), Math.min(h, w));
        System.out.println(h + w - m);
    }
    
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

In Java, you need to specify the types for the variables and make use of class and method definitions. I've also included the necessary imports and closed the Scanner after using it to prevent resource leakage. The `gcd` function and the logic within the `main` method remain mostly unchanged, with appropriate syntax adjustments to fit the Java language.
