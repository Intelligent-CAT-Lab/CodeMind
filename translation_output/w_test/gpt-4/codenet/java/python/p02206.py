Here's the equivalent Python code for the provided Java code:

```python
def main():
    n, k = map(int, input().split())
    left = 1
    right = k + 1
    while right - left > 1:
        m = (left + right) // 2
        x = m
        total = 0
        for i in range(n):
            if x <= 0 or total > k:
                break
            total += x
            x //= 2
        if total <= k:
            left = m
        else:
            right = m
    print(left)

if __name__ == "__main__":
    main()
```

To test this code, you could run it and input `1 1` to achieve the expected output:

```
1
```
