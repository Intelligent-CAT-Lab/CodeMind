```python
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.input = stream.buffer
        self.printbuffer = b''
        
    def close(self):
        self.input.close()
    
    def nextInt(self):
        return int(self.nextLong())
    
    def nextLong(self):
        return int(self.nextStr())
    
    def nextDouble(self):
        return float(self.nextStr())
    
    def nextChar(self):
        return chr(self.input.read(1)[0])

    def nextStr(self):
        build = bytearray()
        while True:
            c = self.input.read(1)
            if c.isspace():
                break
            build += c
        return build.decode()
    
    def nextLine(self):
        line = bytearray()
        while True:
            c = self.input.read(1)
            if not c or c == b'\n':
                break
            line += c
        return line.decode()
    
    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]
    
    def nextIntArrayDec(self, n):
        return [self.nextInt() - 1 for _ in range(n)]
    
    def nextIntArray1Index(self, n):
        return {i: self.nextInt() for i in range(1, n+1)}
    
    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]
    
    def nextLongArrayDec(self, n):
        return [self.nextLong() - 1 for _ in range(n)]
    
    def nextLongArray1Index(self, n):
        return {i: self.nextLong() for i in range(1, n+1)}
    
    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

class p02766:
    def __init__(self):
        self.inpt = FastScanner()
        self.MOD = 10**9 + 7

    def ceil(self, a, b):
        return (a + b - 1) // b

    def gcd(self, a, b):
        return a if not b else self.gcd(b, a % b)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def solve(self):
        N, K = self.inpt.nextInt(), self.inpt.nextInt()
        base, cnt = 1, 0
        while base <= N:
            cnt += 1
            base *= K
        print(cnt)

    def main(self):
        self.solve()

if __name__ == "__main__":
    p = p02766()
    p.main()
```
This is the translated Python version of the Java code provided. The program reads two integers as input, calculates the power of the second integer until it exceeds the first integer, and then outputs the count.
