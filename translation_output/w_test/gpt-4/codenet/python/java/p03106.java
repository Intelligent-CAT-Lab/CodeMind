Sure, here's the equivalent Java code:

```java
import java.util.*;

public class CommonDivisorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res.add(i);
            }
        }

        Collections.sort(res, Collections.reverseOrder());
        System.out.println(res.get(k - 1));
    }
}
```

Once you compile and run this Java program, you will need to provide an input in the same format as the sample test case (e.g., "8 12 2" without quotes). The program will produce the output `2`, which is the same as the provided expected output.
