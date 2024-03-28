class main:
    import sys
    from io import BytesIO, IOBase
    import os
    import sys
    from collections import namedtuple
    import math
    
    
    class ExtendedScanner:
        def __init__(self, stream):
            self.stream = stream
            self.is_printable = lambda x: x == 33 or x == 126
    
        def read(self):
            while not self.is_printable(self.stream.peek()) and self.stream.has_next():
                self.stream.read()
            if not self.stream.has_next():
                raise Exception("Reached EOF")
            
            result = []
            while self.is_printable(self.stream.peek()):
                result.append(self.stream.read())
            
            return "".join(result)
    
        def read_int(self):
            return int(self.read())
    
        def read_long(self):
            return int(self.read())
    
        def read_double(self):
            return float(self.read())
    
        def read_bytes(self, length):
            result = []
            for _ in range(length):
                result.append(self.stream.read())
            return result
    
    
    class OutputStream:
        def __init__(self, stream):
            self.stream = stream
    
        def write(self, value):
            self.stream.write(str(value).encode())
    
        def writeln(self, value):
            self.stream.write(f"{value}\n".encode())
    
    
    class InputStream:
        def __init__(self, data):
            self.pos = 0
            self.data = data
    
        def read(self):
            if self.has_next():
                self.pos += 1
                return self.data[self.pos - 1]
            raise Exception("Reached EOF")
    
        def peek(self):
            if self.has_next():
                return self.data[self.pos]
            return None
    
        def has_next(self):
            return self.pos < len(self.data)
    
    
    def solve(sc, out):
        n = sc.read_int()
        if n & -n == n:
            out.writeln("No")
            return
    
        out.writeln("Yes")
        if n == 3:
            out.writeln("1 2\n2 3\n3 4\n4 5\n5 6")
            return
    
        k = int(math.log2(n))
        for i in range(1, (1 << k) - 1):
            out.write(f"{i} {i + 1}\n")
        
        out.write(f"{(1 << k) - 1} {n + 1}\n")
        
        for i in range(1, (1 << k) - 1):
            out.write(f"{n + i} {n + i + 1}\n")
        
        out.write(f"{(1 << k) + 1} {n + (1 << k)}\n")
        out.write(f"{n + (1 << k)} {n + 1}\n")
        out.write(f"{n + 1} {n + (1 << k) + 1}\n")
        
        for j in range(2, n - (1 << k) + 1):
            out.write(f"{n + j} {n + (1 << k) + j}\n")
            out.write(f"{n + (1 << k) + j - 1} {(1 << k) + j}\n")
    
    
    def execute(in_stream, out_stream):
        sc = ExtendedScanner(in_stream)
        out = OutputStream(out_stream)
        solve(sc, out)
    
    
    input_data = "3"
    input_stream = InputStream(input_data)
    output_stream = BytesIO()
    execute(input_stream, output_stream)
    output_stream.seek(0)
    print(output_stream.read().decode())