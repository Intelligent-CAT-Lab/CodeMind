```java
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int s = a * b;
        int t = c * d;

        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```
