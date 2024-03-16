Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        int t = 1, n = 1, a = 1;

        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t += 1;
        }

        System.out.println(t);
    }
}
```

To test the Java code with the test input "4 2", you can execute the following:

```shell
echo "4 2" | java Solution
```

You should get the expected output, which is:

```
3
```
