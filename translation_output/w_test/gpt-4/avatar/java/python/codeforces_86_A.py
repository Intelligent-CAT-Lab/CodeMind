Here is the Python translation of the given Java code:

```python
def power(a):
    res = 0
    while a > 0:
        res += 1
        a //= 10
    return res

def mult(a):
    pow_ = power(a)
    max_ = 0
    for j in range(pow_):
        max_ = max_ * 10 + 9
    return a * (max_ - a)

if __name__ == "__main__":
    l, r = map(int, input().split())
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = temp // 2 * (temp - temp // 2)

    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        if l <= temp // 2 <= r:
            res = max(maxxes[i], res)

    print(res)
```

Now, let's test the code with the given input:

Test input:
```
999999999 999999999
```

Expected output:
```
0
```

Running the Python code with this input should produce the expected output.
