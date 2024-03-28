```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int q = N / 100;
        int mod = N % 100;

        if (mod <= q * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```
