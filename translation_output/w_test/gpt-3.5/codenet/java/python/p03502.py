```python
def main():
    N = int(input().strip())
    X = N
    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
