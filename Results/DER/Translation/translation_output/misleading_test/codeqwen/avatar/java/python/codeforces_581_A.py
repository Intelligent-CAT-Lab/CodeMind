Here is the Python equivalent of the Java code:

```python
def main():
    a, b = map(int, input().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    ans = a // 2 + b // 2
    print(count, ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, then enters a loop that continues until either `a` or `b` is less than or equal to 0. In each iteration of the loop, it increments `count`, then decrements `a` and `b` by 1. After the loop, it calculates `ans` as the integer division of `a` by 2 plus the integer division of `b` by 2. Finally, it prints `count` and `ans`.
