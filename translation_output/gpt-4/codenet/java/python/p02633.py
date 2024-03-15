Below is the translated Java code into Python:

```python
import sys

MOD = 1_000_000_007  # 10^9+7
MAX = 2_147_483_646  # intMax
INF = 1_000_000_000  # 10^9


class Hayami:
    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_value, traceback):
        pass

    def hayami_saori(self, char):
        return 33 <= char <= 126

    def hayamisaori(self):
        char = self._read_char()
        while char != '' and not self.hayami_saori(ord(char)):
            char = self._read_char()
        return char != ''

    def next_hayami(self):
        char = self._read_char_while_ignoring()
        if char == '':
            raise StopIteration
        hayamin = []
        while self.hayami_saori(ord(char)):
            hayamin.append(char)
            char = self._read_char()
        return ''.join(hayamin)

    def saori_hayami(self):  # nextInt
        return int(self.next_hayami())

    def saorihayami(self):  # nextLong
        number_string = self.next_hayami()
        return int(number_string)

    def hayamin(self):  # nextDouble
        return float(self.next_hayami())

    def _read_char(self):
        return sys.stdin.read(1) if not sys.stdin.closed else ''

    def _read_char_while_ignoring(self):
        char = self._read_char()
        while char != '' and not self.hayami_saori(ord(char)):
            char = self._read_char()
        return char


def main():
    with Hayami() as saori:
        n = saori.saori_hayami()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                return
            i += 1


if __name__ == "__main__":
    main()
```

Please note that: 
- I've used context managers (`__enter__` and `__exit__` methods in Python to mimic Java's `Closeable` interface, although here `close` is not really needed because Python closes files automatically when the end of the program is reached).
- I've used `sys.stdin.read(1)` to replicate `InputStream` behavior for reading one character at a time. This will work when input is provided to the script, like through piping or redirection.
- Iterating through characters with `next_hayami()`, `saorihayami()`, and `hayamin()` has been done using an approach that matches how you might handle input in Python.
- The `while` loop and function names are kept the same to follow the logic of the Java code.
- `StopIteration` exception to handle the end of input just as `NoSuchElementException` would in Java.
- `NumberFormat` exception is not checked here, due to Python's way of automatically raising exceptions for invalid conversions.
- Python doesn't have a straightforward equivalent of Java's `InputStream` buffer handling, so this code assumes the input is properly provided and doesn't handle end-of-file or other `InputStream` intricacies in the same way.
