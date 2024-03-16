Here's the translation of the Java code to Python code:

```python
from math import pow

class p01639:
    def __init__(self):
        self.n, self.k, self.x0 = map(int, input().split())
        self.k -= 1

    def run(self):
        if self.x0 == 0:
            print("0")
            return

        x = self.x0
        s = int(1e4)
        count = [0] * s
        offset = pow(2, 63)
        M = s / pow(2, 64)
        
        for i in range(self.n):
            at = int((x + offset) * M)
            at = max(0, min(at, s - 1))
            count[at] += 1
            x ^= x << 13
            x ^= (x >> 7) & 0xFFFFFFFFFFFFFFFF
            x ^= x << 17
            x &= 0xFFFFFFFFFFFFFFFF # Handling overflow for 64-bit

        sum = 0
        length = target = -1
        for i, c in enumerate(count):
            if sum <= self.k < sum + c:
                target = i
                length = c
                break
            sum += c

        now = 0
        is_list = [0] * length
        x = self.x0
        for i in range(self.n):
            at = int((x + offset) * M)
            at = max(0, min(at, s - 1))
            if at == target:
                is_list[now] = x
                now += 1
            x ^= x << 13
            x ^= (x >> 7) & 0xFFFFFFFFFFFFFFFF
            x ^= x << 17
            x &= 0xFFFFFFFFFFFFFFFF # Handling overflow for 64-bit

        is_list.sort()
        print(is_list[self.k - sum])

if __name__ == "__main__":
    program = p01639()
    program.run()
```

Make sure to test this translation with actual inputs to ensure that it works correctly.

For the given test input, the following REPL style test uses the class:

```python
test_program = p01639()
test_program.run() # assuming you've input "100 100 100" (or another suitable test case)
```

Expected output:
```
-768720241707614171
```

