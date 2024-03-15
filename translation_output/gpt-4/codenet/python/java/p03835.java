Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class SumCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
```

Explanation:
- Firstly, we import `Scanner` to read input from the console, similar to `input()` in Python.
- We read `k` and `s` from the user input. These values correspond to the values captured by `map(int,input().split())` in Python.
- We then use a nested loop to iterate through the range of 0 to `k` for both `z` and `y`, similar to the nested comprehension in the Python code.
- Inside the nested loop, we check if the computed value of `s - y - z` is between `0` and `k` (inclusive). If the condition is satisfied, we increment `sum`.
- Finally, we print the value of `sum`, which represents the sum of all valid combinations that meet the condition `0 <= s - y - z <= k`.
