<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
24

Expected output:
3


```

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02660 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.next());
        scan.close();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Map<Long, Integer> pMap = new HashMap<Long, Integer>();
        for (long i = 2; i < Math.sqrt(n); i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                pMap.put(i, count);
            }
        }
        if (n != 1) {
            pMap.put(n, 1);
        }

        int ans = 0;
        for (int pCount : pMap.values()) {
            int i = 1;
            while (pCount >= i) {
                pCount -= i;
                ans++;
                i++;
            }
        }

        System.out.println(ans);
    }

}

```

### Response:
```python
import math

def count_distinct_prime_factors(n):
    if n == 1:
        return 0

    p_map = {}
    for i in range(2, math.isqrt(n) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            p_map[i] = count

    if n != 1:
        p_map[n] = 1

    ans = 0
    for p_count in p_map.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    return ans

n = int(input())
print(count_distinct_prime_factors(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, counts the number of distinct prime factors of that integer, and prints the count to the standard output. The `math.isqrt(n)` function is used to get the integer square root of `n`, which is the largest integer less than or equal to the square root of `n`. This is used as the upper limit for the loop that checks for prime factors.
<|EOT|>
