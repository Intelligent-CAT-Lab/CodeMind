Here is the translated Python code:

```python
def p03268():
    n, k = map(int, input().split())

    num = [0] * k

    for i in range(1, n + 1):
        num[i % k] += 1

    res = 0
    for a in range(k):
        b = (k - a) % k
        c = (k - a) % k
        if (b + c) % k != 0:
            continue
        res += num[a] * num[b] * num[c]

    print(res)

if __name__ == "__main__":
    p03268()
```

Let me know if you need further explanations about the code or any part of the translation process.
