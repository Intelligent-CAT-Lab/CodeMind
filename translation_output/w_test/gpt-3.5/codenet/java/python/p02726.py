```python
import sys

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokens = iter(self.input_stream.read().split())
    
    def next(self):
        return next(self.tokens)
    
    def nextInt(self):
        return int(self.next())

def main():
    scanner = Scanner(sys.stdin.buffer)
    out = sys.stdout

    n, x, y = scanner.nextInt(), scanner.nextInt()-1, scanner.nextInt()-1
    edges = [0] * n

    for i in range(n):
        for j in range(i+1, n):
            edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
            edges[edge] += 1

    for i in range(1, n):
        out.write(str(edges[i]) + '\n')

if __name__ == '__main__':
    main()
```

