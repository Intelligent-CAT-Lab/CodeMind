```java
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;

        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n << 1) & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n >> 1) & mask)).replace(' ', '0'));

        scanner.close();
    }
}
```
