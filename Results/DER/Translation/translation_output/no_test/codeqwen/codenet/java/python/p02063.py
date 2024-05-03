Here is the Python equivalent of the Java code:

```python
import time

startTime = time.time()

A = int(input())
B = int(input())

for i in range(B + 1, 10**10):
    if (i & 0xFF) == 0 and time.time() - startTime > 3.5:
        break
    ca = i // A + i % A
    remb = i % B
    cb = i // B + remb // A + remb % A
    if ca < cb:
        print(i)
        break

else:
    print(-1)
```

Please note that the Java code uses `System.currentTimeMillis()` to get the current time in milliseconds, while the Python code uses `time.time()` to get the current time in seconds. Also, the Java code uses `i / A + i % A` to calculate `ca`, while the Python code uses `i // A + i % A` to achieve the same result. The `//` operator in Python performs integer division, which is equivalent to `/` in Java when both operands are integers.
