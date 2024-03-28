```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N <= K) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```
