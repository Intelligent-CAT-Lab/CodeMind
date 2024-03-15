Here's the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) >= 1) {
            i += 1;
        }

        System.out.println(i);
        scanner.close();
    }
}
```

Note that in Java, we use `Math.pow` to raise a number to the power of another, and we use `Scanner` for input purposes. The division operator `/` in Java with two integers will give the floor division result just like `//` in Python does.
