Here is the translated Java code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class CubeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> cnt = new HashMap<>();

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        cnt.put(a, cnt.getOrDefault(a, 0) + 1);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(cnt.getOrDefault(i, 0));
        }

        scanner.close();
    }
}
```
To use the above code, provide the input number when prompted. The code calculates the counts of the expression `x^2 + y^2 + z^2 + xy + yz + zx` for `x, y, z` in the range `[1,100]` and outputs the count for each number up to `n`.
