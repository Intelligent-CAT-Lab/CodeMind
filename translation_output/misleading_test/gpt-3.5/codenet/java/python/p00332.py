```python
import sys

class FastScanner:
    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.length = 0
        self.pointer = 0

    def has_next_byte(self):
        if self.pointer < self.length:
            return True
        else:
            self.pointer = 0
            try:
                self.length = self.in_stream.readinto(self.buffer)
            except Exception as e:
                print(e)
                return False
            if self.length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            val = self.buffer[self.pointer]
            self.pointer += 1
            return val
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.pointer]):
            self.pointer += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        sb = bytearray()
        while self.has_next_byte():
            t = self.read_byte()
            if self.is_printable(t):
                sb.append(t)
            else:
                break
        return sb.decode("UTF-8")

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

def solve(in_stream):
    e, y = map(int, in_stream.read().split())

    if e == 0:  # seireki
        if 1868 <= y <= 1911:  # meiji
            print("M" + str(y - 1867))
        elif 1912 <= y <= 1925:  # taishou
            print("T" + str(y - 1911))
        elif 1926 <= y <= 1988:  # shouwa
            print("S" + str(y - 1925))
        else:  # heisei
            print("H" + str(y - 1988)
    elif e == 1:  # meiji
        print(1867 + y)
    elif e == 2:  # taishou
        print(1911 + y)
    elif e == 3:  # shouwa
        print(1925 + y)
    elif e == 4:  # heisei
        print(1988 + y)

def main():
    in_stream = FastScanner(sys.stdin.buffer)
    solve(in_stream)

if __name__ == "__main__":
    main()
```
```
