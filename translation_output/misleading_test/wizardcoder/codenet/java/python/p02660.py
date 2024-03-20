Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

def primeFactors(n):
    factors = {}
    i = 2
    while i <= math.sqrt(n):
        if n % i == 0:
            count = 0
            while n % i == 0:
                count += 1
                n /= i
            factors[i] = count
        i += 1
    if n > 1:
        factors[n] = 1
    return factors

def countFactors(factors):
    count = 0
    for pCount in factors.values():
        i = 1
        while pCount >= i:
            pCount -= i
            count += 1
            i += 1
    return count

n = int(input())

if n == 1:
    print(0)
else:
    factors = primeFactors(n)
    count = countFactors(factors)
    print(count)
```

Explanation:

- We first define a function `primeFactors` that takes an integer `n` as input and returns a dictionary containing the prime factors of `n` as keys and their respective counts as values.
- We then define a function `countFactors` that takes a dictionary `factors` as input and returns the number of factors of `n` that are prime.
- In the main function, we first check if `n` is equal to 1, in which case we print 0 and return.
- Otherwise, we call the `primeFactors` function to get the prime factors of `n` and store them in a dictionary `factors`.
- We then call the `countFactors` function to get the number of prime factors of `n` and store it in a variable `count`.
- Finally, we print `count`.<|endoftext|>
