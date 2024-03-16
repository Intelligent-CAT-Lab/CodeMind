```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 1;
        int x = a;

        while (x * 2 <= b) {
            x = x * 2;
            count++;
        }

        System.out.println(count);
    }
}
```
