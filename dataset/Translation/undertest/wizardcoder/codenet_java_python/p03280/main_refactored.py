class main:
    import sys
    
    class FastReader:
        def __init__(self):
            self.buf = sys.stdin.buffer
            self.tokenizer = None
    
        def readline(self):
            return self.buf.readline().rstrip()
    
        def read_int(self):
            return int(self.readline())
    
        def read_ints(self):
            return list(map(int, self.readline().split()))
    
        def read_long(self):
            return int(self.readline())
    
        def read_longs(self):
            return list(map(int, self.readline().split()))
    
        def read_float(self):
            return float(self.readline())
    
        def read_floats(self):
            return list(map(float, self.readline().split()))
    
        def read_string(self):
            return self.readline().decode()
    
        def read_strings(self):
            return self.readline().decode().split()
    
    class FastWriter:
        def __init__(self, file):
            self.file = file
    
        def write(self, data):
            self.file.write(data)
    
        def flush(self):
            self.file.flush()
    
    def main():
        sc = FastReader()
        out = FastWriter(sys.stdout.buffer)
        k = sc.read_int() - 1
        b = sc.read_int() - 1
        out.write(str(k * b) + '\n')
        out.flush()
    
    if __name__ == '__main__':
        main()