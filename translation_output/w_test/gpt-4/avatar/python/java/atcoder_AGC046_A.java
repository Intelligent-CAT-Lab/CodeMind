Certainly! Below is the equivalent Java code that matches the functionality of the provided Python sample.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int i = 1;
        int a = 0;

        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }

        scanner.close();
    }
}
```

You would compile and run this Java program, and if you input `1` just like in your test case, it will output `360`.
