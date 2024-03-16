<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
from collections import defaultdict

def main():
    n = int(input())

    if n == 1:
        print(0)
        return

    p_map = defaultdict(int)
    for i in range(2, math.isqrt(n) + 1):
        while n % i == 0:
            p_map[i] += 1
            n //= i
    if n != 1:
        p_map[n] = 1

    ans = 0
    for p_count in p_map.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's 1, and if not, it calculates the prime factors of the number and counts the number of times each prime factor appears. It then prints the count of prime factors.
<|EOT|>
