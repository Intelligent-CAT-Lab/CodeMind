Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int h = Math.abs(b - d);
        int w = Math.abs(c - a);
        if (h == 0 || w == 0) {
            System.out.println(0);
            return;
        }
        int m = gcd(Math.max(h, w), Math.min(h, w));
        System.out.println(h + w - m);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the absolute difference between the y-coordinates and x-coordinates, and then finds the greatest common divisor of the two differences. It then prints the sum of the two differences minus the greatest common divisor.
