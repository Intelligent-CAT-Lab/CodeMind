<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
24

Expected output:
20

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

@@ Response
```python
import math

def p02660(n):
    if n == 1:
        return 0

    p_map = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n /= i
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

# Test input
print(p02660(24))  # Expected output: 20
```

This Python code does the same thing as the Java code. It first checks if the input number is 1, in which case it returns 0. Then it creates a dictionary to store the prime factors of the number and their counts. After that, it iterates over the values in the dictionary, subtracting the current iteration value from the count and incrementing the answer until the count is less than the current iteration value. Finally, it returns the answer.<｜end▁of▁sentence｜>
