```python
import sys

class SC:
    def __init__(self, input_stream):
        self.reader = input_stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

MOD = 1000000007

def main():
    sc = SC(sys.stdin)
    n = sc.nextLong()
    k = sc.nextLong()
    ans = 1
    for i in range(n):
        ans = (ans * k) % MOD
    print(ans)

if __name__ == "__main__":
    main()
```

