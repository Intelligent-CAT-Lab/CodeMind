```python
import sys

class FastScanner:
    def __init__(self):
        self.input_buffer = []
        self.input_ptr = 0

    def hasNext(self):
        while not self.input_buffer or self.input_ptr == len(self.input_buffer):
            self.input_buffer = sys.stdin.readline().split()
            self.input_ptr = 0
        return self.input_ptr < len(self.input_buffer)

    def nextInt(self):
        if not self.hasNext():
            raise StopIteration
        result = int(self.input_buffer[self.input_ptr])
        self.input_ptr += 1
        return result

def pow_func(l, i):
    MOD = 1000000007
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow_func(l, i // 2)
            return val * val % 2019
        else:
            return pow_func(l, i - 1) * l % 2019

def main():
    fs = FastScanner()
    n = fs.nextInt()
    k = fs.nextInt()
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % 1000000007
    print(ans)

if __name__ == "__main__":
    main()
```

