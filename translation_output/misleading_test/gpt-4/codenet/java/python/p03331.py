Below is the Python translation of the given Java code:

```python
def digit(num):
    r = 0
    while True:
        r += (num % 10)
        num //= 10
        if num == 0:
            break
    return r


def main():
    n = int(input())
    ans = n
    for a in range(2, n // 2 + 1):
        b = n - a
        sum_of_digits = digit(a) + digit(b)
        ans = min(sum_of_digits, ans)
    print(ans)


if __name__ == "__main__":
    main()
```

Test this with an input of `15`:
```
15
```

Expected output:
```
4
```
