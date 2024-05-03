Here is the Python equivalent of the Java code you provided:

```python
import sys

class p02612:
    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        inp = InputReader(input_stream)
        out = PrintWriter(output_stream)
        solver = TaskA()
        solver.solve(1, inp, out)
        out.close()

class TaskA:
    def solve(self, testNumber, inp, out):
        n = inp.nextInt()
        x = n // 1000
        y = n % 1000
        if y == 0:
            out.println(0)
        else:
            ans = 1000 * (x + 1) - n
            out.println(ans)

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader().split()
            except:
                raise EOFError()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

class PrintWriter:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []

    def print(self, *args):
        self.buffer.extend(map(str, args))

    def println(self, *args):
        self.print(*args)
        self.buffer.append('\n')

    def close(self):
        self.stream.write(''.join(self.buffer))
        self.stream.flush()

p02612().main()
```

Please note that Python does not have a built-in `System.out` or `System.in` equivalent, so I've replaced them with `sys.stdout` and `sys.stdin` respectively. Also, Python does not have a built-in `PrintWriter` class, so I've created a custom `PrintWriter` class to mimic
