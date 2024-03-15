```python
class p02342:
    
    @staticmethod
    def main():
        p02342().run()
    
    def run(self):
        sc = FastScanner()
        
        n = sc.nextInt()
        k = sc.nextInt()

        print(self.partition(n-k, k))

    @staticmethod
    def partition(n, k):
        if n < 0:
            return 0
        if n == 0:
            return 1
        mod = 1000000007
        if k > n:
            k = n
        dp = [[0] * (k+1) for _ in range(n+1)]
        dp[0][0] = 1
        for i in range(n+1):
            dp[i][1] = 1
        for i in range(2, k+1):
            dp[0][i] = 1
            dp[1][i] = 1
        for i in range(1, n+1):
            for j in range(2, k+1):
                if i - j >= 0:
                    dp[i][j] = dp[i][j-1] + dp[i-j][j]
                    dp[i][j] %= mod
                else:
                    dp[i][j] = dp[i][j-1]
        
        return dp[n][k]

class FastScanner:
    def __init__(self):
        self.in_stream = None
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0
    
    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = len(self.in_stream.read(self.buffer))
            except IOError as e:
                print(e)
            if self.buflen <= 0:
                return False
        return True
    
    def read_byte(self):
        if self.has_next_byte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1
    
    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126
    
    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()
    
    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)
    
    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if b < ord('0') or b > ord('9'):
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()
    
    def next_int(self):
        nl = self.next_long()
        if nl < int(-2 ** 31) or nl > int(2 ** 31 - 1):
            raise ValueError
        return int(nl)
```

