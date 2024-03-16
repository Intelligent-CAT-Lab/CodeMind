```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.cur_char = 0
        self.num_chars = 0

    def read(self):
        if self.num_chars == -1:
            raise ValueError('InputMismatchException')
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError as e:
                raise ValueError('InputMismatchException')
            if self.num_chars <= 0:
                return -1
        result = self.buf[self.cur_char]
        self.cur_char += 1
        return result

    def ni(self):
        c = self.read()
        while c != -1 and c in b' \n\r\t':
            c = self.read()
        sgn = 1
        if c == 45:  # ASCII for '-'
            sgn = -1
            c = self.read()
        res = 0
        while c != -1 and not (c in b' \n\r\t'):
            if c < 48 or c > 57:  # ASCII for '0' to '9'
                raise ValueError('InputMismatchException')
            res = res * 10 + (c - 48)
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                print(' ', end='', file=self.stream)
            print(objects[i], end='', file=self.stream)

    def println(self, *objects):
        self.print(*objects)
        print(file=self.stream)

def solve(test_number, inp, out):
    a, b, c = inp.ni(), inp.ni(), inp.ni()
    if (c >= a and c <= b) or (c >= b and c <= a):
        out.println("Yes")
    else:
        out.println("No")

def main():
    inp = InputReader(sys.stdin.buffer)
    out = OutputWriter(sys.stdout.buffer)
    solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    main()
```
```
