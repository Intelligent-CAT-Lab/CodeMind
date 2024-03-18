Certainly! Here's the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
        System.out.println(c);
    }
}
```

The given Python code takes two integers as input, then in a loop it adds the maximum of the two numbers to a sum variable `c` for two iterations. After each addition, it decrements the larger of the two numbers by 1. Finally, it prints the sum `c`.

The translated Java code works very similarly. It uses `Scanner` to read the two numbers as input, initializes a variable `c` to sum up the max values, uses a `for` loop to run the iterations, and uses `System.out.println` to print the resulting `c`.

If you run this Java program with the test input `6 6`, it will produce the expected output `-19`.
