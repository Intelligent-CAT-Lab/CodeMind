class main:
    class MyScanner:
        def read(self):
            try:
                return sys.stdin.read(1)
            except:
                raise InputMismatchException()
    
        def isSpaceChar(self, c):
            return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == ''
    
        def isEndline(self, c):
            return c == '\n' or c == '\r' or c == ''
    
        def next(self):
            c = self.read()
            while self.isSpaceChar(c):
                c = self.read()
            res = []
            while not self.isSpaceChar(c):
                res.append(c)
                c = self.read()
            return ''.join(res)
    
    class p01772:
        def run(self):
            sc = MyScanner()
    
            c = sc.next()
            n = len(c)
            s = []
            for i in range(n):
                if c[i] == 'A' or c[i] == 'Z':
                    s.append(c[i])
            c = ''.join(s)
            n = len(c)
            s = []
            for i in range(n):
                if not s or s[-1] != c[i]:
                    s.append(c[i])
            if s and s[0] == 'Z':
                s = s[1:]
            if s and s[-1] == 'A':
                s = s[:-1]
            if s:
                print(''.join(s))
            else:
                print(-1)
    
        def main(self):
            self.run()
    
    if __name__ == "__main__":
        p01772().main()