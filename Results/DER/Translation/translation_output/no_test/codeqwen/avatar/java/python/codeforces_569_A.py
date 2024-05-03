Here is the Python equivalent of the Java code:

```python
import sys

class codeforces_569_A:
    def main(self):
        input_stream = sys.stdin
        output_stream = sys.stdout
        inp = InputReader(input_stream)
        solver = TaskA()
        solver.solve(1, inp, output_stream)

class TaskA:
    def solve(self, test_number, inp, output_stream):
        t = inp.nextInt()
        s = inp.nextInt()
        q = inp.nextInt()
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        output_stream.write(str(sum) + '\n')

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def hasNext(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader().split()
            except:
                return False
        return True

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader().split()
            except:
                raise EOFError
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLong(self):
        return int(self.next())

    def nextBigInteger(self):
        return int(self.next())

    def nextBigDecimal(self):
        return float(self.next())

if __name__ == "__main__":
    codeforces_569_A().main()
```

Please note that Python does not have a built-in BigInteger or BigDecimal type, so I've used int and float instead. Also, Python does not have a built-in EOFError, so I've used a custom exception.
