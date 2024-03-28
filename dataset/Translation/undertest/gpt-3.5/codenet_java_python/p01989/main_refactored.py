class main:
    class FastScanner:
        def __init__(self, stream):
            self.stream = stream
            self.buffer = bytearray()
            self.pos = 0
        
        def has_next_byte(self):
            if self.pos < len(self.buffer):
                return True
            else:
                self.pos = 0
                self.buffer = self.stream.read(1024)
                if len(self.buffer) <= 0:
                    return False
            return True
        
        def read_byte(self):
            if self.has_next_byte():
                result = self.buffer[self.pos]
                self.pos += 1
                return result
            return -1
    
        def is_printable(self, n):
            return 33 <= n <= 126
    
        def skip(self):
            while self.has_next_byte() and not self.is_printable(self.buffer[self.pos]):
                self.pos += 1
    
        def has_next(self):
            self.skip()
            return self.has_next_byte()
    
        def next(self):
            if not self.has_next():
                raise StopIteration
            sb = bytearray()
            t = self.read_byte()
            while self.is_printable(t):
                sb.append(t)
                t = self.read_byte()
            return sb.decode()
    
        def next_int(self):
            return int(self.next())
    
        def next_array(self, n):
            return [self.next() for _ in range(n)]
    
        def next_int_array(self, n):
            return [self.next_int() for _ in range(n)]
    
        def next_long(self):
            return int(self.next())
    
        def next_long_array(self, n):
            return [self.next_long() for _ in range(n)]
    
    def solve(in_stream, out_stream):
        in_stream = FastScanner(in_stream)
        s = in_stream.next()
        length = len(s)
        ans = 0
        
        for i in range(1, length-2):
            for j in range(i+1, length-1):
                for k in range(j+1, length):
                    a = [s[:i], s[i:j], s[j:k], s[k:]]
                    for x in range(4):
                        if len(a[x]) != len(str(int(a[x]))):
                            break
                    else:
                        b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                        if all(b[x] <= 255 for x in range(4)):
                            ans += 1
        
        out_stream.write(str(ans) + "\n")
    
    if __name__ == "__main__":
        import sys
        solve(sys.stdin.buffer, sys.stdout.buffer)