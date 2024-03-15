```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ▁ ");
                a = i;
            }
        }
    }
}
```
