class main:
    import sys
    
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
            for i in range(2, len(Util.inv)):
                Util.inv[i] = (Util._m - (Util._m // i) * Util.inv[Util._m % i] % Util._m) % Util._m
            for i in range(2, len(Util.fact)):
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
    
    class MyScan:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray()
            self.index = 0
            self.read_to_end()
    
        def read_to_end(self):
            while True:
                data = self.stream.read()
                if data == -1:
                    break
                self.buf.append(data)
    
        def nextInt(self):
            self.skip_spaces()
            num = 0
            minus = False
            while self.index < len(self.buf):
                b = self.buf[self.index]
                self.index += 1
                if b == ord('-'):
                    minus = True
                    continue
                if b < ord('0') or b > ord('9'):
                    break
                num = num * 10 + (b - ord('0'))
            return -num if minus else num
    
        def skip_spaces(self):
            while self.index < len(self.buf):
                if self.buf[self.index] == ord(' '):
                    self.index += 1
                else:
                    break
    
    if __name__ == '__main__':
        stream = sys.stdin
        solver = TaskC()
        solver.solve(0, MyScan(stream), sys.stdout)