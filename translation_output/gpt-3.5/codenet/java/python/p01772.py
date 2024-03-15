```python
import sys

class MyScanner:
    def read(self):
        return sys.stdin.read(1)

    def is_space_char(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def is_endline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        array = []
        for _ in range(n):
            array.append(self.next_int())
        return array

    def next_long(self):
        return int(self.next())

    def next_long_array(self, n):
        array = []
        for _ in range(n):
            array.append(self.next_long())
        return array

    def next_double(self):
        return float(self.next())

    def next_double_array(self, n):
        array = []
        for _ in range(n):
            array.append(self.next_double())
        return array

    def next(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = []
        res.append(c)
        while not self.is_space_char(c):
            c = self.read()
            res.append(c)
        return "".join(res[:-1])

    def next_string_array(self, n):
        array = []
        for _ in range(n):
            array.append(self.next())
        return array

    def next_line(self):
        c = self.read()
        while self.is_endline(c):
            c = self.read()
        res = []
        res.append(c)
        while not self.is_endline(c):
            c = self.read()
            res.append(c)
        return "".join(res[:-1])


class p01772:
    def run(self):
        sc = MyScanner()

        c = list(sc.next())
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = "".join(s)
        n = len(c)
        s = []
        for i in range(n):
            if len(s) == 0 or s[-1] != c[i]:
                s.append(c[i])
        if len(s) > 0 and s[0] == 'Z':
            s = s[1:]
        if len(s) > 0 and s[-1] == 'A':
            s.pop()
        if len(s) > 0:
            print("".join(s))
        else:
            print(-1)

    def main(self):
        self.run()

if __name__ == "__main__":
    p = p01772()
    p.main()
```
```
