```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int result = (int) Math.ceil(k/2) * (k/2);
        System.out.println(result);
    }
}
```
