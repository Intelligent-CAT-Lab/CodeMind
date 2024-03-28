class main:
    import sys
    
    class BigInt:
        def __init__(self, w):
            self.w = w
            self.MOD = 100000000
    
        def clone(self):
            return BigInt(self.w.clone())
    
        def digitSum(self):
            sum = 0
            for wi in self.w:
                sum += self.digitSum(wi)
            return sum
    
        def digitSum(self, wi):
            w = 0
            while wi >= 1:
                w += wi % 10
                wi //= 10
            return w
    
        def multiply(self, n):
            c = 0
            for i in range(len(self.w)):
                self.w[i] *= n
                self.w[i] += c
                c = self.w[i] // self.MOD
                self.w[i] %= self.MOD
    
        def add(self, n):
            self.w[0] += n
            for i in range(1, len(self.w)):
                if self.w[i] < self.MOD:
                    break
                up = self.w[i] // self.MOD
                self.w[i] %= self.MOD
                self.w[i+1] += up
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray(1 << 12)
            self.curChar = 0
            self.numChars = -1
    
        def next(self):
            if self.