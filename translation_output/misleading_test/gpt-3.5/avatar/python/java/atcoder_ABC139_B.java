```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int h = scanner.nextInt();

        int result = (h - 2) / (t - 1) + 1;
        System.out.println(result);
    }
}
```
