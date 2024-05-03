Here is the Python equivalent of your Java code:

```python
class FastReader:
    def __init__(self):
        self.br = open(0)
        self.st = None

    def next_line(self):
        str_ = ""
        try:
            str_ = self.br.readline().strip()
        except Exception as e:
            print(e)
        return str_

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next(self):
        while self.st is None or not self.st.any():
            try:
                self.st = iter(self.br.readline().strip().split())
            except Exception as e:
                print(e)
        return next(self.st)


def main():
    s = FastReader()
    obj = main()
    sum_ = 0
    h = s.next_long()
    if h == 1:
        print(1)
    else:
        count = 1
        while h > 1:
            h = h // 2
            sum_ += 2 ** count
            count += 1
        print(sum_ + 1)


if __name__ == "__main__":
    main()
```

Please note that in Python, we don't need to declare the type of variables, and we use `//` for integer division. Also, Python uses `iter()` and `next()` to iterate over the elements of a list, which is similar to `StringTokenizer` in Java.
