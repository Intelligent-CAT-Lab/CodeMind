Here is the Python equivalent of the Java code:

```python
x = int(input())
ans = 0

for i in range(100000):
    if x <= i * (i + 1) // 2:
        ans = i
        break

print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates from 0 to 99999. If the current value of `i` times `(i + 1)` divided by 2 is less than or equal to the user's input, it sets `ans` to `i` and breaks out of the loop. Finally, it prints the value of `ans`.
