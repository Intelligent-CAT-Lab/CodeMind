Here is the equivalent Java code for the given Python code snippet:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.println(a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(c)))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
```

This Java code will take three space-separated integers as input and compute the results similar to the Python code:

- Calculates the area of a triangle given two sides and an angle between them - 0.5 * a * b * Math.sin(Math.toRadians(c))
- Computes the length of a third side using the law of cosines - a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(c))))
- Calculates the height of the triangle when side 'a' is treated as the base - b * Math.sin(Math.toRadians(c))

Remember to include necessary imports for `Scanner` and `Math` classes before compiling the Java program.
