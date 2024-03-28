Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99999

Expected output:
90909


```
import java.util.*;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int count = 0;
        int temp = N;
        int ans = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        for (int i = 1; i <= count; i++) {
            if (i == count) {
                if (i % 2 == 1) {
                    ans += (N - Math.pow(10, i - 1) + 1);
                }
            } else {
                if (i == 1) {
                    ans += 9;
                } else if (i % 2 == 1) {
                    ans += (Math.pow(10, i) - Math.pow(10, i - 1));
                }
            }
        }

        System.out.println(ans);
    }
}
```

### Response:
```python
import math

N = int(input())
count = 0
temp = N
ans = 0

while temp > 0:
    temp //= 10
    count += 1

for i in range(1, count+1):
    if i == count:
        if i % 2 == 1:
            ans += (N - 10**(i-1) + 1)
    else:
        if i == 1:
            ans += 9
        elif i % 2 == 1:
            ans += (10**i - 10**(i-1))

print(ans)
```<|endoftext|>
