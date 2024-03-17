<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

def get_prime_factors(n):
    factors = {}
    i = 2
    while i <= math.sqrt(n):
        if n % i == 0:
            factors[i] = 0
            while n % i == 0:
                n /= i
                factors[i] += 1
        i += 1
    if n > 1:
        factors[n] = 1
    return factors

def get_number_of_divisors(factors):
    ans = 1
    for p, pCount in factors.items():
        i = 1
        while pCount >= i:
            pCount -= i
            ans += 1
            i += 1
    return ans

n = int(input())
if n == 1:
    print(0)
else:
    factors = get_prime_factors(n)
    print(get_number_of_divisors(factors))

```
<|endoftext|>
