class main:
    import sys
    
    class FastScanner:
        def __init__(self, inp=sys.stdin):
            self.inp = inp
            self.buffer = None
            self.ptr = 0
            self.buffer_length = 0
    
        def has_next_byte(self):
            if self.ptr < self.buffer_length:
                return True
            else:
                self.ptr = 0
                try:
                    self.buffer = self.inp.read()
                except EOFError:
                    return False
                self.buffer_length = len(self.buffer)
                if self.buffer_length <= 0:
                    return False
                return True
    
        def read_byte(self):
            if self.has_next_byte():
                return self.buffer[self.ptr]
            else:
                return -1
    
        def next(self):
            if not self.has_next_byte():
                raise StopIteration
            s = []
            b = self.read_byte()
            while True:
                if b == -1