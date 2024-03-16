```python
def main():
    N, A, B = map(int, input().split())
    ans = 0
    for i in range(1, N + 1):
        sum = 0
        j = i
        while j > 0:
            sum += j % 10
            j //= 10
        if A <= sum <= B:
            ans += i
    print(ans)

if __name__ == "__main__":
    main()
```
