Here's the equivalent Python code to the provided Java code:

```python
import sys

class Scanner:
    def __init__(self):
        self.st = []
    
    def next(self):
        while not self.st:
            line = sys.stdin.readline()
            if not line:
                return None
            self.st = line.split()
        return self.st.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return long(self.next())
    
    def next_line(self):
        return sys.stdin.readline().strip()
    
    def next_double(self):
        x = self.next()
        neg = False
        if x[0] == '-':
            neg = True
            x = x[1:]
        res, idx, f = 0, x.find('.'), 1
        if idx != -1:
            res = int(x[:idx])
            x = x[idx+1:]
            while x:
                res = res * 10 + int(x[0])
                f *= 10
                x = x[1:]
        else:
            res = int(x)
        return res / f * (-1 if neg else 1)
    
    def ready(self):
        return sys.stdin.readable()

def main():
    s = Scanner()
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

Note:
- We've created a `Scanner` class that emulates the Java Scanner, although Python generally doesn't require such a class since reading and manipulating input is simple with built-in functions.
- We're reading from the standard input (`sys.stdin`) instead of an `InputStream` object.
- Python's `print` function is used instead of `System.out.println`.
- Python's `readline` method is used to read lines from the input, and `split` is used to tokenize them.
- The `next_double` method has been translated to perform the same manipulations as in the original code, but Python's float parsing is usually done simply with the `float` constructor. However, I've translated it in a way that follows the logic from the given Java code.
- Keep in mind that Python's division operator `/` always produces a float result, whereas in Java, the equivalent `/` operator would produce an integer result if both operands are integers.
