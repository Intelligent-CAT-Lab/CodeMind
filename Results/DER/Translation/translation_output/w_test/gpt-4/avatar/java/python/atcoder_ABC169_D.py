Here is the equivalent of the provided Java code in Python:

```python
import math

def prime_factor(n):
    res = []
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            n //= i
            count += 1
        if count != 0:
            res.append(count)
    if n != 1:
        res.append(1)
    return res

def atcoder_abc169_d(n):
    factors = prime_factor(n)
    count = 0
    for i in factors:
        pow = i
        increase = 1
        while pow - increase >= 0:
            pow -= increase
            increase += 1
            count += 1
    return count

# Test case
input_number = 366735600000
print(atcoder_abc169_d(input_number))  # Expected output: 10
```

This code defines two functions: `prime_factor(n)` which finds the prime factors of a number `n` and their counts, and `atcoder_abc169_d(n)` which uses these counts to determine the final count according to the logic provided in the original Java code. The provided test case should output `10` as expected.
