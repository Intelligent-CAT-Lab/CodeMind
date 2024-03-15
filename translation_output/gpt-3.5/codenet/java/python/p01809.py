```python
def main():
    yaku = []

    p, q = map(int, input().split())
    qs = 0
    ans = 1
    bp = p
    bq = q
    buf = p

    while bq % bp != 0:
        buf = bq % bp
        bq = bp
        bp = buf

    qs = q // buf
    for i in range(2, int(qs ** 0.5) + 1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i

    ans *= qs
    print(ans)

if __name__ == "__main__":
    main()
```
