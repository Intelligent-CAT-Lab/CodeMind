Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
-85

```

import sys
def input():
	return sys.stdin.readline().strip()

N = int(input())

def sum_N(N):
	total = 0
	x = N
	while x > 0:
		total += x % 10
		x = x // 10
	return total

ans = 1000000000000
for i in range(1, N):
	ans = min(ans, sum_N(i) + sum_N(N - i))

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int ans = 1000000000000;
        for (int i = 1; i < N; i++) {
            int sum1 = 0, sum2 = 0;
            int x = i, y = N - i;
            while (x > 0) {
                sum1 += x % 10;
                x = x / 10;
            }
            while (y > 0) {
                sum2 += y % 10;
                y = y / 10;
            }
            ans = Math.min(ans, sum1 + sum2);
        }

        System.out.println(ans);
    }
}
```<|endoftext|>
