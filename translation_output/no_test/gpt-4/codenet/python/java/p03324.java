```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        int result = (int) Math.pow(100, D) * (N != 100 ? N : N + 1);
        System.out.println(result);
    }
}
```
