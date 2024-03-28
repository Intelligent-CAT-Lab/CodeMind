```java
import java.util.Scanner;

public class PowerModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(power(m, n, mod));
    }

    public static int power(int m, int n, int mod) {
        return (int) Math.pow(m, n) % mod;
    }
}
```
