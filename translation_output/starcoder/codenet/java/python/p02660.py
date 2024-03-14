<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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
        if (n!= 1) {
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

python code:<fim_suffix><fim_middle>

```python
import math

def p2660():
    n = int(input())
    if n == 1:
        print(0)
        return
    pMap = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            pMap[i] = count
    if n!= 1:
        pMap[n] = 1
    ans = 0
    for pCount in pMap.values():
        i = 1
        while pCount >= i:
            pCount -= i
            ans += 1
            i += 1
    print(ans)

if __name__ == '__main__':
    p2660()

```
<|endoftext|>
