class main:
    import sys
    
    class FastScanner:
        def __init__(self, input):
            self.input = input
    
        def nextInt(self):
            return int(self.nextLong())
    
        def nextLong(self):
            sign = 1
            b = self.input.read()
            while (b < '0' or '9' < b) and b != '-' and b != '+':
                b = self.input.read()
            if b == '-':
                sign = -1
                b = self.input.read()
            elif b == '+':
                b = self