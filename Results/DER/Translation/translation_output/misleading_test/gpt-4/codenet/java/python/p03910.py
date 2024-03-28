Here's the translated Python code for the given Java code:

```python
class FastScanner:
    def __init__(self):
        import sys
        self.stream = sys.stdin.buffer
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def _read_byte(self):
        if self.ptr >= self.buflen:
            self.ptr = 0
            self.buflen = 0
            self.buflen = self.stream.readinto(self.buffer)
            if self.buflen == 0:
                return -1
        byte = self.buffer[self.ptr]
        self.ptr += 1
        return byte

    def _read_next_char(self):
        c = self._read_byte()
        while c > 0 and (c < 33 or c > 126):
            c = self._read_byte()
        return c

    def next(self):
        c = self._read_next_char()
        if c == -1:
            raise ValueError("Reached end of input")
        results = bytearray()
        while c > 0 and (33 <= c <= 126):
            results.append(c)
            c = self._read_byte()
        return results.decode()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

if __name__ == '__main__':
    sc = FastScanner()
    N = sc.next_int()
    table = [0] * (N + 1)
    M = 0
    for i in range(1, N + 1):
        table[i] = table[i - 1] + i
        if table[i] >= N:
            M = i
            break

    s = set()
    for i in range(1, M + 1):
        s.add(i)
    s.remove(table[M] - N)

    for a in s:
        print(a)
```
To use this code, you would read input from stdin and the output would print to stdout, just like the original Java code. Make sure that when calling `next_int()` or `next_double()`, the input is given in a single line and matches the expectations of the input read functions.
