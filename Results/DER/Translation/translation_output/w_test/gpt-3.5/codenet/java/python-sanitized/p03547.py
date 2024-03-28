import sys

MOD = 1_000_000_007

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = b''
        self.ptr = 0
        self.buflen = 0

    def next(self):
        while not self.has_next():
            pass
        return self.parse_next()
    
    def has_next(self):
        while self.ptr >= self.buflen:
            self.ptr = 0
            self.buflen = self.input_stream.readinto(self.buffer)
            if self.buflen == 0:
                return False
        return True

    def parse_next(self):
        sb = bytearray()
        b = self.buffer[self.ptr]
        self.ptr += 1
        while 33 <= b <= 126:
            sb.append(b)
            if self.ptr >= self.buflen:
                self.ptr = 0
                self.buflen = self.input_stream.readinto(self.buffer)
            b = self.buffer[self.ptr]
            self.ptr += 1
        return sb.decode()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

class Solution:
    def __init__(self):
        self.sc = FastScanner()
    
    def solve(self):
        X = self.sc.next()
        Y = self.sc.next()
        ans = "="
        if ord(X) - ord(Y) < 0:
            ans = "<"
        elif ord(X) - ord(Y) > 0:
            ans = ">"
        self.out(ans)

    def out(self, a):
        print(a)

if __name__ == '__main__':
    solution = Solution()
    solution.solve()