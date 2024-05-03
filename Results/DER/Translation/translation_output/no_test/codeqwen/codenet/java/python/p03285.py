Here is the Python equivalent of the Java code:

```python
N = int(input())
limit7 = N // 7
check = False
for i in range(limit7 + 1):
    left = N - (i * 7)
    if left % 4 == 0:
        check = True
        break
if check:
    print("Yes")
else:
    print("No")
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the maximum number of times 7 can be subtracted from it, and then checks if the remainder when divided by 4 is zero. If it is, it prints "Yes", otherwise it prints "No".
