class main:
    import java.io.OutputStream;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.PrintWriter;
    import java.util.InputMismatchException;
    import java.io.IOException;
    import java.io.InputStream;
    
    class TaskC:
        def solve(self, testNumber, in, out):
            i = in.nextInt()
    
            md = [0] * i
    
            rm = i - 2
            lx = i - 2
            while rm >= 0:
                md[lx + 1] = Util.c(rm, lx)
                rm -= 2
                lx -= 1
    
            res = 0
            prev = 0
            for m in range(1, i):
                cur = Util.fact(m) * Util.fact(i - m - 1) % Util._m
                cur = cur * (md[m]) % Util._m
    
                res += (cur - prev + Util._m) * m % Util._m
                prev = cur
    
            out.println(res % Util._m)
    
    class Util:
        M07 = 1000_000_007
        _m = M07
        fact = None
        inv = None
        ifact = None
    
        @staticmethod
        def l():
            Util.fact = [1] * 1000001
            Util.inv = [1] * 1000001
            Util.ifact = [1] * 1000001
            for s in range(2):
                Util.fact[s] = 1
                Util.ifact[s] = 1
                Util.inv[s] = 1
            Util.inv[0] = 0
            for i in range(2, Util.inv.length):
                Util.inv[i] = (Util._m - (Util._m // i) * Util.inv[Util._m % i] % Util._m) % Util._m
            for i in range(2, Util.fact.length):
                Util.fact[i] = i * Util.fact[i - 1] % Util._m
                Util.ifact[i] = Util.inv[i] * Util.ifact[i - 1] % Util._m
    
        @staticmethod
        def c(a, b):
            if Util.fact is None:
                Util.l()
            return Util.ifact[a] * Util.ifact[b - a] % Util._m * Util.fact[b] % Util._m
    
        @staticmethod
        def fact(a):
            if Util.fact is None:
                Util.l()
            return Util.fact[a]
    
    class MyScan:
        def __init__(self, in):
            self.in = in
            self.inbuf = bytearray(1024)
            self.lenbuf = 0
            self.ptrbuf = 0
    
        def readByte(self):
            if self.lenbuf == -1:
                raise InputMismatchException()
            if self.ptrbuf >= self.lenbuf:
                self.ptrbuf = 0
                try:
                    self.lenbuf = self.in.read(self.inbuf)
                except IOException as e:
                    raise InputMismatchException()
                if self.lenbuf <= 0:
                    return -1
            return self.inbuf[self.ptrbuf]
    
        def nextInt(self):
            num = 0
            b = self.readByte()
            minus = False
            while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
                b = self.readByte()
            if b == '-':
                minus = True
                b = self.readByte()
            while b!= -1 and (b >= '0' and b <= '9'):
                num = num * 10 + (b - '0')
                b = self.readByte()
            return -num if minus else num
    
    if __name__ == '__main__':
        inputStream = System.in
        outputStream = System.out
        in = MyScan(inputStream)
        out = PrintWriter(outputStream)
        solver = TaskC()
        solver.solve(1, in, out)
        out.close()