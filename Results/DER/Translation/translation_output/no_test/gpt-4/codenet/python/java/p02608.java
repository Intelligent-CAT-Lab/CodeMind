Below is the translated Java code for the given Python program. Note that I'm using a `HashMap` to simulate the counting behavior of Python's `collections.Counter`:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (a <= n) {
                        if (!counter.containsKey(a)) {
                            counter.put(a, 0);
                        }
                        counter.put(a, counter.get(a) + 1);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (counter.containsKey(i)) {
                System.out.println(counter.get(i));
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}
```
This Java program will provide the same functionality as the given Python program. It reads an integer `n` from the input, calculates the frequency of `a` (where `a` is the sum of the squares of `x`, `y`, and `z`, plus the products of each pair of these numbers), and then prints out the frequency of each number from 1 to `n`.
