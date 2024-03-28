class main:
    import sys
    
    class FastInput:
        def __init__(self, is):
            self.is = is
            self.buf = bytearray(1 << 13)
            self.bufLen = 0
            self.bufOffset = 0
            self.next = -1
    
        def read(self):
            while self.bufLen == self.bufOffset:
                self.bufOffset = 0
                self.bufLen = self.is.readinto(self.buf)
                if self.bufLen == -1:
                    return -1
            return self.buf[self.bufOffset]
    
        def skipBlank(self):
            while self.next >= 0 and self.next <= 32:
                self.next = self.read()
    
        def readString(self, builder):
            self.skipBlank()
    
            while self.next > 32:
                builder.append(chr(self.next))
                self.next = self.read()
    
            return builder
    
        def readString(self):
            builder = []
            return self.readString(builder)
    
    class FastOutput:
        def __init__(self, os):
            self.os = os
            self.cache = []
    
        def println(self, c):
            self.cache.append(c)
            self.cache.append('\n')
    
        def flush(self):
            self.os.write(''.join(self.cache))
            self.cache = []
    
        def close(self):
            self.flush()
            self.os.close()
    
    class TaskA:
        def solve(self, testNumber, inp, out):
            s = inp.readString()
            cIndex = s.find('C')
            fIndex = s.rfind('F')
            if cIndex < 0 or fIndex < 0 or fIndex < cIndex:
                out.println("No")
            else:
                out.println("Yes")
    
    def main():
        inp = FastInput(sys.stdin)
        out = FastOutput(sys.stdout)
        solver = TaskA()
        solver.solve(1, inp, out)
        out.close()
    
    if __name__ == "__main__":
        main()