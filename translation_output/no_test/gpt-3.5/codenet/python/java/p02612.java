```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1000 - n % 1000 != 0 ? 1000 - n % 1000 : 0;
        System.out.println(result);
    }
}
```
