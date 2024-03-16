Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }

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
}
```

To test it with the provided test input, you would need to enter the numbers from the standard input when prompted (e.g., using a command line or integrated development environment).

The expected output would be:
```
4
```
