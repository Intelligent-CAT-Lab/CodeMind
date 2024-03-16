```python
import time

A, B = map(int, input().split())
start_time = time.time()

i = B + 1
while True:
    if i & 0xFF == 0 and time.time() - start_time > 3.5:
        break

    ca = i // A + i % A
    remb = i % B
    cb = i // B + remb // A + remb % A

    if ca < cb:
        print(i)
        break

    i += 1

if i & 0xFF != 0 or time.time() - start_time <= 3.5:
    print(-1)
```
