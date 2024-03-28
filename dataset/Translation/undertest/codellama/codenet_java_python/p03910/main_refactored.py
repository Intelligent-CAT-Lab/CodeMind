class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.in = sys.stdin
            self.buffer = bytearray(1024)
            self.ptr = 0
            self.buflen = 0
    
        def hasNextByte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.in.readinto(self.buffer)
                except IOError:
                    pass
                if self.buflen <= 0:
                    return False
    
        def readByte(self):
            if self.hasNextByte():
                return self.buffer[self.ptr]
            else:
                return -1
    
        def isPrintableChar(self, c):
            return 33 <= c <= 126
    
        def hasNext(self):
            while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
                self.ptr += 1
            return self.hasNextByte()
    
        def next(self):
            if not self.hasNext():
                raise NoSuchElementException()
            sb = []
            b = self.readByte()
            while self.isPrintableChar(b):
                sb.append(chr(b))
                b = self.readByte()
            return "".join(sb)
    
        def nextLong(self):
            if not self.hasNext():
                raise NoSuchElementException()
            n = 0
            minus = False
            b = self.readByte()
            if b == "-":
                minus = True
                b = self.readByte()
            if b < "0" or "9" < b:
                raise NumberFormatException()
            while True:
                if "0" <= b <= "9":
                    n *= 10
                    n += ord(b) - ord("0")
                elif b == -1 or not self.isPrintableChar(b):
                    return -n if minus else n
                else:
                    raise NumberFormatException()
                b = self.readByte()
    
        def nextInt(self):
            nl = self.nextLong()
            if nl < sys.maxint or nl > sys.maxint:
                raise NumberFormatException()
            return int(nl)
    
        def nextDouble(self):
            return float(self.next())
    
    
    def main():
        sc = FastScanner()
        N = sc.nextInt()
        table = [0] * (N + 1)
        table[0] = 0
        M = 0
        for i in range(1, N + 1):
            table[i] = table[i - 1] + i
            if table[i] >= N:
                M = i
                break
        s = set()
        for i in range(1, M + 1):
            s.add(i)
        s.remove(table[M] - N)
        for a in s:
            print(a)
    
    
    if __name__ == "__main__":
        main()