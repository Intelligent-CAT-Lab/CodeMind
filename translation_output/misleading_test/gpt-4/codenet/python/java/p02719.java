Below is the Java translation of your provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int rot = n / k;
        int x = n;

        if (k == 1 || n == k || n % k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k * rot;
        }

        int t = x % k;

        System.out.println(Math.min(t, Math.abs(t - k)));
    }
}
```

And this is how you can run it with the test input:

```sh
echo "7 4" | java Main
```

Expected output will be:
```sh
92
```

But please note that the expected output is actually incorrect for the given test input. The correct output for the input "7 4" should be "1" and if you run the Python code with that input this is the result that will be printed. Please double-check that you've provided the correct test input and expected output.
