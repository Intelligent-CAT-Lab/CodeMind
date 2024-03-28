```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(Math.pow(m, n) % mod);
    }
}
```
