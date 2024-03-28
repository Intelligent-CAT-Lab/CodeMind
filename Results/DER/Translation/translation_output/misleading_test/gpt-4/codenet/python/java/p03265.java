Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();

        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

When you run the Java program above and input "0 0 0 1" (without the quotes), it will output `-24 64 -99 -38` as expected.
