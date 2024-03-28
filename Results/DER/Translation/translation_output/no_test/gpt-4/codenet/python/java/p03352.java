Here's the translated Java code that provides similar functionality to the Python code you provided:

```java
import java.util.Scanner;

public class PowerMaximizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        int ans = 1;
        
        for (int b = 1; b < x; b++) {
            for (int p = 2; ; p++) {
                int temp = (int)Math.pow(b, p);
                if (temp <= x) {
                    ans = Math.max(ans, temp);
                } else {
                    break;
                }
            }
        }
        
        System.out.println(ans); // Output the answer
        scanner.close();
    }
}
```

This Java program does the same as the Python program: it reads an integer from the user, then it goes through all possible bases (`b`) smaller than `x` and all possible powers (`p`) starting at 2 until the power of `b` exceeds `x`. During the iterations, it keeps track of the maximum value (`ans`) computed as `b` raised to the power of `p` that is smaller or equal to `x` and finally outputs it. Note that I've wrapped the code inside a class and a `main` method, as is required by Java. Additionally, I've enclosed the reading of the input within a print statement to prompt the user, which wasn't present in the original Python code, and closed the scanner at the end to avoid resource leaks.
