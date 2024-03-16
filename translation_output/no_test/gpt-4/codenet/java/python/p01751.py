Here's the translated Java code to Python:

```python
import sys

class Reader:
    def __init__(self, file_like=sys.stdin.buffer):
        self.file_like = file_like
        self.buffer = []

    def next_int(self):
        while not self.buffer:
            self.buffer += self.file_like.readline().strip().split()
        return int(self.buffer.pop(0))

def main():
    sc = Reader()
    a = sc.next_int()
    b = sc.next_int()
    c = sc.next_int()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60*i+c) % d <= a:
            e = i
            break

    if e == -1:
        print(-1)
    else:
        print(60*e+c)

    sys.stdout.flush()

if __name__ == "__main__":
    main()
```

Some things to notice about this translation:
- Python does not have a concept of "package" as in Java, so we do not import packages but modules or specific functions/classes from modules.
- Classes in Python do not need explicit constructors if they do not perform any initialization. However, in this case, the `Reader` class does.
- Instead of using a `PrintWriter`, Python can directly print to standard output using the `print` function.
- In Python, explicit flushing of stdout is rarely required because `print` statements are generally line-buffered, but it's included here as a direct translation of the Java code that uses `flush()`.
- The Python `range` function is used to replace Java's `for` looping syntax in this context.
- The `Reader` class handles input slightly differently in Python because of different methods to read from stdin.
- Java's try-with-resources and `close()` calls are not required in this Python snippet because Python's file-like objects are usually context-managed using `with` statements which handle closing automatically, though in scripts it is also often left to the interpreter to close them when the program ends.
