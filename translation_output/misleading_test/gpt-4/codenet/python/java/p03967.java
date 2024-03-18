Below is the translation from the given Python code to Java:

```java
import java.util.Scanner;

public class GpgCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ret = 0;

        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 1 : 0);
        }

        System.out.println(ret);

        scanner.close();
    }
}
```

To run the above Java program, you need to compile it and execute the generated class file, providing 'gpg' as the input when prompted. The output will be -32 as expected.
