Here's the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        scanner.close();

        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);

        System.out.println(ans);
    }
}
```

To test the code, you can simply run the Java program and provide the input:
```
501719768609305159 370614275896614890 131105492712690269
```

And you should receive the expected output:
```
370614275896614890
```
