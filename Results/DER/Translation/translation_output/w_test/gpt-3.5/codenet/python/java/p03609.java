```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();

        int result = x - t > 0 ? x - t : 0;
        System.out.println(result);
    }
}
```
