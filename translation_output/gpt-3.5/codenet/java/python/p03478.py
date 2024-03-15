```python
def main():
    N = int(input())
    A = int(input())
    B = int(input())
    ans = 0
    for i in range(1, N+1):
        sum_digits = 0
        j = i
        while j > 0:
            sum_digits += j % 10
            j //= 10
        if A <= sum_digits and sum_digits <= B:
            ans += i
    print(ans)

if __name__ == "__main__":
    main()
```
