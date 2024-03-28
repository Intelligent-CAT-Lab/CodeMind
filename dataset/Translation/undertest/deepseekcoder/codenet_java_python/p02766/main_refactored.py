class main:
    import sys
    
    class FastScanner:
        def __init__(self, input=sys.stdin):
            self.input = input
    
        def close(self):
            self.input.close()
    
        def next_int(self):
            return int(self.next_long())
    
        def next_long(self):
            sign = 1
            b = self.input.read(1)
            while b != '-' and b != '+' and not b.isdigit():
                b = self.input.read(1)
            if b == '-':
                sign = -1
                b = self.input.read(1)
            elif b == '+