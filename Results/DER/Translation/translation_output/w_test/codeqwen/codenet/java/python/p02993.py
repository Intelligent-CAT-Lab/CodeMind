Here is the Python equivalent of the Java code:

```python
class Scanner:
    def __init__(self, s):
        self.st = None
        self.br = s

    def next(self):
        while self.st is None or not self.st.has_more_tokens():
            self.st = self.br.readline().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.br.readline()

    def next_double(self):
        x = self.next()
        res = 0
        f = 1
        dec = False
        neg = False
        start = 0
        if x[0] == '-':
            neg = True
            start += 1
        for i in range(start, len(x)):
            if x[i] == '.':
                res = float(x[:i])
                x = x[i+1:]
                dec = True
            else:
                res = res * 10 + int(x[i])
                if dec:
                    f *= 10
        res += float(x) / f
        return res * (neg*-1)

    def ready(self):
        return self.br.ready()


def main():
    s = Scanner(sys.stdin)
    word = s.next()
    flag = False
    for i in range(len(word)-1):
        if word[i] == word[i+1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")


if __name__ == "__main__":
    import sys
    main()
```

Please note that the `Scanner` class is not exactly the same as the Java `Scanner` class. This is because Python does not have a built-in `Scanner` class. Instead, I have created a custom `Scanner` class that mimics the behavior of the Java `Scanner` class. The `Scanner` class has methods for reading different types
