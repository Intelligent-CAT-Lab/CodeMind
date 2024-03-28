Here is the translated Python code:
```python
def pow(a, n):
    ret = 1
    while n > 0:
        if n % 2 == 1:
            ret *= a
        a *= a
        n >>= 1
    return ret

def main():
    n = int(input())
    m = int(input())
    a = int(input())
    b = int(input())
    p = int(input())
    q = int(input())
    INF = 1000_000_000_000_000

    if a == 1 and b == 1:
        ans = INF
        div = m // (p + q)
        div = min(div, n)
        ans = min(ans, abs(div * (p + q) - m))
        div = min(div + 1, n)
        ans = min(ans, abs(div * (p + q) - m))
        print(ans)
        return

    lim = 0
    while p * pow(a, lim) + q * pow(b, lim) <= m:
        lim += 1
    lim += 1
    lim = min(lim, n)
    lim = min(lim, 40)

    pending1 = []
    pending2 = []
    powA = [0] * 42
    powB = [0] * 42
    powA[0] = 1
    powB[0] = 1
    for i in range(1, len(powA)):
        powA[i] = powA[i - 1] * a
        powB[i] = powB[i - 1] * b

    for t in range(2):
        max_idx = lim // 2 if t == 0 else (lim + 1) // 2
        for i in range(1 << max_idx):
            s = 0
            for j in range(max_idx):
                if (i & (1 << j)) > 0:
                    s += p * powA[j + (lim // 2 if t == 1 else 0)] + \
                         q * powB[j + (lim // 2 if t == 1 else 0)]
                    if s > INF:
                        break
            else:
                if t == 0:
                    pending1.append(s)
                else:
                    pending2.append(s)
    
    pending1.sort()
    pending2.sort()

    ans = m
    for j in range(2):
        t = len(pending2) - 1
        for i in range(len(pending1)):
            if j == 0:
                while t > 0 and pending1[i] + pending2[t] > m:
                    t -= 1
            elif j == 1:
                while t > 0 and pending1[i] + pending2[t] >= m and \
                      pending1[i] + pending2[t - 1] >= m:
                    t -= 1
            ans = min(ans, abs(-m + pending1[i] + pending2[t]))
    
    print(ans)

if __name__ == "__main__":
    main()
```

A few notes on the translation:

- The Java `Scanner` class for user input is replaced with Python's `input()` function. Each call to `input()` takes the next input from the user (assumed to be on a separate line).
- In Python, array indexing starts from 0, so the loop over array indices starts from the beginning unlike Java which can start from 1 if the 0th element is already set.
- Java's `long` type is equivalent to Python's `int` since Python integers can be of arbitrary size and act like "long" integers by default.
- Python doesn't have a `Math.pow()` for long integers, so the custom `pow` function handles integer powers efficiently.
- `1L << max` in Java for shifting a long value is equivalent to `1 << max` in Python.
- The `ArrayList` in Java is similar to a list in Python.
- Collections sorting in Python is done using the `sort()` list method.
- Python uses `elif` instead of Java's `else if`.
