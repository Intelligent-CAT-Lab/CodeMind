Here is the Python equivalent of the Java code:

```python
def solve():
    A, B = map(int, input().split())
    if A > 9 or B > 9:
        print(-1)
        return
    print(A * B)

solve()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if they are less than 10, and then prints their product. If either of the integers is greater than or equal to 10, it prints -1.
