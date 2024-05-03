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
        return self.br.readline().strip()

    def next_double(self):
        x = self.next()
        res = 0
        f = 1
        dec = False
        neg = False
        if x[0] == '-':
            neg = True
            x = x[1:]
        for i in x:
            if i == '.':
                res = float(res)
                res = res * 10
                dec = True
            else:
                res = res * 10 + int(i)
                if dec:
                    f *= 10
        res = res / f
        return res * (-1 if neg else 1)

    def ready(self):
        return self.br.readable()


def main():
    s = Scanner(input())
    word = s.next()
    flag = False
    for i in range(len(word) - 1):
        if word[i] == word[i + 1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if there are any consecutive characters in the string, and prints "Bad" if there are, and "Good" otherwise.
