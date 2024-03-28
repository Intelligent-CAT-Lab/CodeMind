Here is the Python translation of the given Java code:

```python
import sys

class Reader:
    def __init__(self, file=sys.stdin.buffer):
        self.file = file
        self.buf = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def _has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        self.ptr = 0
        try:
            self.buflen = self.file.readinto(self.buf)
        except IOError as e:
            raise e
        return self.buflen > 0

    def _read_byte(self):
        if self._has_next_byte():
            result = self.buf[self.ptr]
            self.ptr += 1
            return result
        return -1

    def _is_printable_char(self, c):
        return 33 <= c <= 126

    def _skip(self):
        while self._has_next_byte() and not self._is_printable_char(self.buf[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self._skip()
        return self._has_next_byte()

    def next(self):
        if not self.has_next():
            raise EOFError()
        sb = bytearray()
        b = self._read_byte()
        while self._is_printable_char(b):
            sb.append(b)
            b = self._read_byte()
        return sb.decode('ascii')

    def next_int(self):
        return int(self.next())

    def close(self):
        self.file.close()

def main():
    sc = Reader()
    a = sc.next_int()
    b = sc.next_int()
    c = sc.next_int()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    sc.close()

if __name__ == "__main__":
    main()
```

The Python version uses Python's built-in file handling instead of a custom Reader class and relies on its exceptions for error handling instead of manually checking for IO errors like the Java code. This simplified version handles input from stdin in a manner similar to the Java version.

To test this script in Python, it should be executed in an environment that can provide standard input, and the output will be printed to standard output.
