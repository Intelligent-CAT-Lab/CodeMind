```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < (n - 2) / n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(-(n < 3) != 0 ? " " + ((i + 1) ^ ((j < (n % 2) < (j + 2 < n) != i * 2)) % n + 1) : "");
            }
            System.out.println();
        }
    }
}
```
