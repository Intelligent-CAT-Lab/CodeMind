```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] values = number.split("â");

        long a = Long.parseLong(values[0]);
        long b = Long.parseLong(values[1]);
        long k = Long.parseLong(values[2]);

        long res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = b < 0 ? 0 : b;
        } else {
            a = res;
        }

        System.out.println(a + " " + b);
    }
}
```
```
