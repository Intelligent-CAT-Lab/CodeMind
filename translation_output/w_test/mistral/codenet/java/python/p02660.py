<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

n = int(input())

if n == 1:
    print(0)
    sys.exit()

pMap = {}
for i in range(2, int(n ** 0.5) + 1):
    count = 0
    while n % i == 0:
        count += 1
        n //= i
    if count > 0:
        pMap[i] = count

ans = 0
for pCount in pMap.values():
    i = 1
    while pCount >= i:
        pCount -= i
        ans += 1
        i += 1

print(ans)
```</s>
