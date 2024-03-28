class main:
    import sys
    
    class Reader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = ''
    
        def readline(self):
            while '\n' not in self.buf:
                self.buf += self.stream.readline().strip()
            line, self.buf = self.buf.split('\n', 1)
            return line
    
        def read(self):
            return self.readline()
    
        def readint(self):
            return int(self.read())
    
        def readlong(self):
            return int(self.read())
    
        def readfloat(self):
            return float(self.read())
    
        def readstr(self):
            return self.read()
    
        def readints(self):
            return list(map(int, self.read().split()))
    
        def readlongs(self):
            return list(map(int, self.read().split()))
    
        def readfloats(self):
            return list(map(float, self.read().split()))
    
        def readstrs(self):
            return self.read().split()
    
    def main():
        reader = Reader(sys.stdin)
        N = reader.readint()
        print((N - 1) // 2)
    
    if __name__ == '__main__':
        main()