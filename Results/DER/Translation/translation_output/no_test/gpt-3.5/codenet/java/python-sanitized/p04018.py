import sys
import io
import array

class KMPAutomaton:
    def __init__(self, cap):
        self.data = array.array('c', '\x00' * (cap + 2))
        self.fail = array.array('i', [-1] * (cap + 2))
        self.buildLast = 0
        self.matchLast = 0
        self.length = cap

    def isMatch(self):
        return self.matchLast == self.length

    def length(self):
        return self.length

    def beginMatch(self):
        self.matchLast = 0

    def visit(self, c, trace):
        while trace >= 0 and self.data[trace + 1] != c:
            trace = self.fail[trace]
        return trace

    def match(self, c):
        self.matchLast = self.visit(c, self.matchLast) + 1

    def build(self, c):
        self.buildLast += 1
        self.fail[self.buildLast] = self.visit(c, self.fail[self.buildLast - 1]) + 1
        self.data[self.buildLast] = c

class FastIO:
    def __init__(self, isstream, osstream=sys.stdout):
        self.cache = io.StringIO()
        self.isstream = isstream
        self.osstream = osstream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next_byte = -1

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.isstream.readinto(self.buf)
            if self.buf_len == 0:
                return -1
        return self.buf[self.buf_offset]

    def skipBlank(self):
        while self.next_byte >= 0 and self.next_byte <= 32:
            self.next_byte = self.read()

    def readInt(self):
        sign = 1
        self.skipBlank()
        if self.next_byte == 43 or self.next_byte == 45:
            sign = 1 if self.next_byte == 43 else -1
            self.next_byte = self.read()

        val = 0
        if sign == 1:
            while 48 <= self.next_byte <= 57:
                val = val * 10 + self.next_byte - 48
                self.next_byte = self.read()
        else:
            while 48 <= self.next_byte <= 57:
                val = val * 10 - self.next_byte + 48
                self.next_byte = self.read()

        return val

    def readString(self, builder):
        self.skipBlank()
        while self.next_byte > 32:
            builder.append(chr(self.next_byte))
            self.next_byte = self.read()

        return builder

    def readLine(self, data, offset):
        original_offset = offset
        while self.next_byte != -1 and self.next_byte != 10:
            data[offset] = chr(self.next_byte)
            offset += 1
            self.next_byte = self.read()
        return offset - original_offset

def solve(io):
    s = [''] * 1000000
    n = io.readString(s)

    kmp = KMPAutomaton(n)
    inv = KMPAutomaton(n)
    
    for i in range(n):
        kmp.build(s[i])
        inv.build(s[n - i - 1])
    
    p = n - kmp.fail[n]
    if n % p != 0:
        p = n

    if p == 1:
        answer(io, n, 1)
        return
    if p == n:
        answer(io, 1, 1)
        return
    
    cnt = 0
    for i in range(2, n + 1):
        p1 = i - 1 - kmp.fail[i - 1]
        p2 = (n + 1 - i) - inv.fail[n + 1 - i]

        f1 = p1 == (i - 1) or (i - 1) % p1 != 0
        f2 = p2 == (n + 1 - i) or (n + 1 - i) % p2 != 0
        
        if f1 and f2:
            cnt += 1

    answer(io, 2, cnt)

def answer(io, length, cnt):
    io.cache.write(f'{length}\n{cnt}')

def main():
    local = False
    async_mode = False

    charset = 'ascii'

    if local:
        io = FastIO(open("D:\\DATABASE\\TESTCASE\\Code.in"), sys.stdout)
    else:
        io = FastIO(sys.stdin, sys.stdout)

    if async_mode:
        import threading
        t = threading.Thread(target=solve, args=(io,))
        t.start()
        t.join()
    else:
        solve(io)

    if local:
        io.cache.write(f'\n\n--memory -- \n{(psutil.virtual_memory().total - psutil.virtual_memory().free) >> 20}M')

    io.flush()

if __name__ == "__main__":
    main()