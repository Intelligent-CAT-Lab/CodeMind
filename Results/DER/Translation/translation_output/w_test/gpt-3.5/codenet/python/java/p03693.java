```java
import java.util.Scanner;

public class RGBDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```
The above Java code performs the same functionality as the provided Python code and reads input values for `r`, `g`, and `b` as integers. It then checks the condition `(g * 10 + b) % 4 == 0` and prints "YES" if the condition is true, otherwise it prints "NO".
