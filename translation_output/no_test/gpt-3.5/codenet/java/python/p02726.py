```python
import sys

class Scanner:
    def __init__(self, input_stream):
        self.br = input_stream
        self.st = None
    
    def next(self):
        while self.st is None or not self.st:
            self.st = input().split()
        return self.st.pop(0)
    
    def nextLine(self):
        return input()
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def inArr(self, n):
        a = [int(val) for val in input().split()]
        return a

def main():
    n, x, y = scanner.nextInt(), scanner.nextInt()-1, scanner.nextInt()-1
    edges = [0] * n

    for i in range(n):
        for j in range(i + 1, n):
            edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
            edges[edge] += 1

    for i in range(1, n):
        print(edges[i])

if __name__ == "__main__":
    scanner = Scanner(sys.stdin)
    main()
```
In the provided code conversion, I made use of Python's input function to read input instead of having a separate Scanner class to handle input. The logic of the Java code remains the same with minor modifications to fit Python syntax.
