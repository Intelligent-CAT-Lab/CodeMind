Here is the equivalent code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        int result = (t / a) * b;
        System.out.println(result);
    }
}
```

Make sure to import the `Scanner` class for taking user input and don't forget to close the `Scanner` object after use to avoid any resource leaks.
