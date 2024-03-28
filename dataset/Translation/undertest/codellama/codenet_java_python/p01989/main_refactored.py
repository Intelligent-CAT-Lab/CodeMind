class main:
    import sys
    
    class FastScanner:
        def __init__(self, stream):
            self.stream = stream
            self.buffer = bytearray(1024)
            self.length = 0