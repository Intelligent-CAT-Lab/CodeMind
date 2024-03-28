```python
import sys

class ContestReader:
    def __init__(self, input_stream):
        self.reader = input_stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(input().split())
            except Exception as e:
                raise RuntimeError(e)
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

def solve(k):
    dptable = [[0 for _ in range(8)] for _ in range(601)]
    dptable[0][0] = 1
    
    for i in range(1, 601):
        dptable[i][0] = 1
        for j in range(1, 8):
            dptable[i][j] = dptable[i-1][j] + dptable[i][j-1]

    countC = [0] * 601
    for i in range(600, 0, -1):
        while k >= dptable[i][7]:
            countC[i] += 1
            k -= dptable[i][7]
    
    result = ''
    for i in range(1, 601):
        result += 'FESTIVA' + ('L' * countC[i])

    return result

def execute(reader):
    k = reader.nextLong()
    print(solve(k))

if __name__ == "__main__":
    reader = ContestReader(sys.stdin)
    execute(reader)
```

