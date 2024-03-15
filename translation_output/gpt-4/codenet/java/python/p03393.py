Here's the Java code translated into Python:

```python
import sys

class p03393:
    _intMax = float('inf')  # Represents positive infinity in Python
    _intMin = float('-inf')  # Represents negative infinity in Python
    _longMax = float('inf')  # Same as above; Python does not distinguish
    _longMin = float('-inf')  # between int and long types as Java does

    def solve(self):
        charset = set(chr(ch) for ch in range(ord('a'), ord('z') + 1))
        line = self.readLine()
        for ch in line:
            charset.discard(ch)
        
        if charset:
            result = line + min(charset)
            self.pln(result)
            return
        
        if line == "zyxwvutsrqponmlkjihgfedcba":
            self.pln(-1)
            return
        
        self.next(line, "")
    
    def next(self, line, cur):
        if line[:len(cur)] > cur:
            return False
        if len(line) == len(cur):
            if line < cur:
                for i in range(len(line)):
                    self.p(cur[i])
                    if line[i] != cur[i]:
                        break
                self.pln("")
                return True
            else:
                return False

        for ch in range(ord('a'), ord('z') + 1):
            ch = chr(ch)
            if ch not in cur:
                if self.next(line, cur + ch):
                    return True
        
        return False

    def abs(self, a):
        return abs(a)

    def max(self, a, b):
        return max(a, b)

    def min(self, a, b):
        return min(a, b)

    def pint(self, s):
        return int(s)

    def plong(self, s):
        return int(s)  # In Python, integers can be of arbitrary size

    def readLine(self):
        try:
            return input().strip()
        except EOFError:
            return ''

    def readNum(self):
        line = self.readLine()
        return self.pint(line)

    def readLong(self):
        line = self.readLine()
        return self.plong(line)

    def readFlds(self):
        line = self.readLine()
        return line.split()

    def readNums(self):
        flds = self.readFlds()
        return [self.pint(fld) for fld in flds]

    def readLongs(self):
        flds = self.readFlds()
        return [self.plong(fld) for fld in flds]

    def p(self, c):
        sys.stdout.write(str(c))

    def pln(self, c):
        sys.stdout.write(str(c) + '\n')

    def main(self):
        start = sys.argv[0]
        self.solve()
        sys.stdout.flush()
        if _bElapsed:
            end = sys.argv[0]
            sys.stderr.write(str(end - start) + "ms\n")

if __name__ == "__main__":
    _bElapsed = False
    p03393().main()
```

A few important notes on this translation:

1. There's no need for BufferedReader or PrintWriter in Python, as input and print functions are available.
2. Integer.MAX_VALUE and Integer.MIN_VALUE are represented simply as `float('inf')` and `float('-inf')` in this context, reflecting the fact that Python's integers are unbounded.
3. The use of `sys.stdin` and `sys.stdout` is how Python typically handles standard input and output streams.
4. There is no string concatenation with `StringBuilder` in Python, as strings are not immutable and can be efficiently concatenated with the `+` operator.
5. Python's `input()` function automatically reads and returns a single line from standard input.
6. Exception handling in Python is done with try-except blocks.
7. I've preserved the class structure and method names from Java for readability, despite not being Pythonic. Some reorganization can be done to follow Python conventions.
