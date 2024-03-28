class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.input_data = sys.stdin.readline().split()
            self.pointer = 0
    
        def hasNextByte(self):
            return self.pointer < len(self.input_data)
    
        def readByte(self):
            if self.hasNextByte():
                self.pointer += 1
                return int(self.input_data[self.pointer - 1])
            else:
                return -1
    
        def isPrintableChar(self, c):
            return 33 <= c <= 126
    
        def skipUnprintable(self):
            while self.hasNextByte() and not self.isPrintableChar(int(self.input_data[self.pointer])):
                self.pointer += 1
    
        def hasNext(self):
            self.skipUnprintable()
            return self.hasNextByte()
    
        def next(self):
            if not self.hasNext():
                raise StopIteration
            result = self.input_data[self.pointer]
            self.pointer += 1
            return result
    
        def nextInt(self):
            if not self.hasNext():
                raise StopIteration
            return int(self.next())
    
    class Solver:
        def __init__(self):
            self.sc = FastScanner()
    
        def solve(self):
            a = self.sc.nextInt()
            b = self.sc.nextInt()
            print(max(a + b, a - b, a * b))
    
    if __name__ == '__main__':
        solver = Solver()
        solver.solve()