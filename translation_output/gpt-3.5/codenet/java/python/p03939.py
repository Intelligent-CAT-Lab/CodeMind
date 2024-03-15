```python
def main():
    N = int(input())
    d1 = float(input())
    x = float(input())

    ans = 0

    for _ in range(N, 0, -1):
        ans += d1 + (_ - 0.5) * x
        d1 = ((2 * _ + 2) * d1 + 5 * x) / (2 * _)
        x = ((float(_) + 2) / _) * x

    print(ans)

if __name__ == "__main__":
    main()
```
