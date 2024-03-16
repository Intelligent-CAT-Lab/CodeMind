Below is the translated code from Python to Java. I've converted the `inpl` function into a simple method that reads input and splits the input to initialize the variables. Note that Java is strictly typed, and we must define the types of all variables. In this case, I've translated Python's integer division `//` into Java's integer division `/` and added explicit integer casts because in Java, the division of integers automatically results in an integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int a = (Math.min(W / 2, x + w / 2) + Math.max(-W / 2, x - w / 2));
        int b = (Math.min(H / 2, y + h / 2) + Math.max(-H / 2, y - h / 2));

        System.out.println((double) b / a);

        scanner.close();
    }
}
```

This Java code reads six integers from the standard input, performs the calculations, and prints out the result as a floating-point number by casting the result of the division `(double) b / a`. Note that in Java, performing division with two integers would yield in an integer, so you have to cast at least one operand to `double` to get a floating-point result.
