System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
def prime_factors(n):
    factors = {}
    while n % 2 == 0:
        if 2 not in factors:
            factors[2] = 0
        factors[2] += 1
        n = n / 2
    for i in range(3, int(n**0.5) + 1, 2):
        while n % i == 0:
            if i not in factors:
                factors[i] = 0
            factors[i] += 1
            n = n / i
    if n > 2:
        factors[n] = 1
    return factors

def main():
    n = int(input())
    if n == 1:
        print(0)
        return
    factors = prime_factors(n)
    ans = 0
    for factor_count in factors.values():
        i = 1
        while factor_count >= i:
            factor_count -= i
            ans += 1
            i += 1
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    24,
    6,
    1,
    100000000000000000
]

expected_outputs = [
    3,
    1,
    0,
    15
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    assert prime_factors(test_input) == expected_output
```<|endoftext|>
