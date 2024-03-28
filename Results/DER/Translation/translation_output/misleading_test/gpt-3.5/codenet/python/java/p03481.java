```java
import java.util.Scanner;

public class BitLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int k = Integer.toBinaryString(Y / X).length();
        System.out.println(k);
    }
}
```
