Below is the translated Java code for the given Python script. Note that Java needs more setup, like importing `Scanner` for input and enclosing the code within a `main` method inside a class.

```java
import java.util.Scanner;

public class ModularExponentiation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long ant = 1, bnt = 1, cnt = 1;
        long modulo = 1000000007;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % modulo;
            bnt = (9 * bnt) % modulo;
            cnt = (8 * cnt) % modulo;
        }

        long ans = (ant - (bnt * 2 - cnt)) % modulo;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(modulo + ans);
        }
    }
}
```

When you run this Java program and input `2`, it will correctly output `2`, just like the Python code.
