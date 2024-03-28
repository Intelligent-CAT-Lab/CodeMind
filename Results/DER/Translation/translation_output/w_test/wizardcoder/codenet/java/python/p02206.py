Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1


```
import java.util.*;

public class p02206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long left = 1;
        long right = k + 1;
        while (right - left > 1) {
            long m = (left + right) / 2;
            long x = m;
            long total = 0;
            for (int i = 0; i < n && x > 0 && total <= k; i++) {
                total += x;
                x /= 2;
            }
            if (total <= k) {
                left = m;
            } else {
                right = m;
            }
        }
        System.out.println(left);
    }
}


```

### Response:
```python
import math

def binary_search(n, k):
    left = 1
    right = k + 1
    while right - left > 1:
        m = (left + right) // 2
        x = m
        total = 0
        for i in range(n):
            total += x
            x //= 2
            if total > k:
                break
        if total <= k:
            left = m
        else:
            right = m
    return left

n, k = map(int, input().split())
print(binary_search(n, k))
```

Explanation:

We can use binary search to find the smallest integer x such that the sum of the first n powers of 2 that are less than or equal to x is less than or equal to k. We can start by initializing left and right to 1 and k+1 respectively. We then use a while loop to keep dividing the search interval in half until we find the smallest x that satisfies the condition. Inside the loop, we calculate the midpoint m of the interval and set x to m. We then use a for loop to calculate the sum of the first n powers of 2 that are less than or equal to x. We divide x by 2 in each iteration until x becomes 0 or the sum of the powers of 2 exceeds k. If the sum of the powers of 2 is less than or equal to k, we update left to m. Otherwise, we update right to m. Finally, we return the value of left, which is the smallest integer x that satisfies the condition.<|endoftext|>
