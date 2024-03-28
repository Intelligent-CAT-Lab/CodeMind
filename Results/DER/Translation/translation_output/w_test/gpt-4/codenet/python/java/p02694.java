Here is the Java translation of the given Python code. To read the input from the user, I will use `Scanner` from `java.util` package.

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int y = 100;
        int ans = 0;
        while (y < x) {
            ans += 1;
            y = (int)Math.floor(y * 1.01);
        }

        System.out.println(ans);
    }
}
```

To test the given input (103) in Java, you would run the program, provide `103` as the input, and you should get `3` as the expected output.
