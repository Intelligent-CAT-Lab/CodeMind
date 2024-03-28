```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Test input:
2 4 6

Expected output:
YES
