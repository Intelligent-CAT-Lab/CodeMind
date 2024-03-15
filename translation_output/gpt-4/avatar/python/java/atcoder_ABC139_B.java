Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int h = scanner.nextInt();
        
        scanner.close();

        int result = ((h - 2) / (t - 1)) + 1;
        System.out.println(result);
    }
}
```

This Java code assumes that dividing two integers should mimic the floor division used in the Python code. Java integer division naturally discards any fractional part, which acts like floor division for positive numbers. The Python code uses `//` operator, which performs floor division, so the translation takes care of that by using integer division directly.
