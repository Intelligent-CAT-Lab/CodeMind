Here is the Python equivalent of the Java code:

```python
a, b, c = map(int, input().split())

for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:
    print("NO")
```

This Python code does the same thing as the Java code. It reads three integers from the user, then it loops from 0 to 5000. If it finds an integer `i` such that `a * i % b == c`, it prints "YES" and breaks the loop. If it doesn't find such an integer, it prints "NO". The `else` clause of the `for` loop is executed if the loop completes normally (i.e., if it didn't encounter a `break` statement), which means that it didn't find an integer `i` such that `a * i % b == c`.
