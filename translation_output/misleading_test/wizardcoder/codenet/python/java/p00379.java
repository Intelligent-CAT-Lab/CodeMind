Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
16 2 1000

Expected output:
9

```
a, n, m = map(int, input().split())
ans = 0
for y in range(1, 50):
    x = (y + a)**n
    if 1 <= x <= m and y == sum(map(int, str(x))):
        ans += 1
print(ans)

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int y = 1; y <= 50; y++) {
            int x = (int) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sum(x)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `nextInt()` method to read integers from the input.

We can use the `Math.pow()` method to calculate the value of `x` in each iteration of the loop.

We can define a separate method `sum()` to calculate the sum of digits of a number. This method takes an integer `num` as input and returns the sum of its digits. We can use a while loop to extract each digit of the number and add it to the `sum` variable.

Finally, we can print the value of `ans` to the console.<|endoftext|>
