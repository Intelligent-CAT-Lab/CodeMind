class FastScanner:
    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.length = 0
        self.p = 0
        
    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.in_stream.readinto(self.buffer)
            except Exception as e:
                e.printStackTrace()
            if self.length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            val = self.buffer[self.p]
            self.p += 1
            return val
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration()
        sb = bytearray()
        t = self.read_byte()
        while self.is_printable(t):
            sb.append(t)
            t = self.read_byte()
        return sb.decode('utf-8')

    def next_int(self):
        return int(self.next())

class Methods:
    def print_array(self, *ar):
        print(ar)

    def max_val(self, *ar):
        return max(ar)

    def min_val(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        return b if b > 0 else self.gcd(b, a % b) if a % b != 0 else a

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, i):
        return 1 if i == 1 else i * self.factorial(i - 1)

    def manhattan_distance(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclidean_distance(self, x1, y1, x2, y2):
        return ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5

    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(n**0.5) + 1, 2):
            if n%i == 0:
                return False
        return True

def solve(in_stream):
    in_scanner = FastScanner(in_stream)
    ms = Methods()

    s = in_scanner.next()
    length = len(s)
    ans = 0

    for i in range(1, length - 2):
        for j in range(i + 1, length - 1):
            for k in range(j + 1, length):
                a = [s[:i], s[i:j], s[j:k], s[k:]]
                
                if any(len(x) != len(str(int(x))) for x in a):
                    continue
                
                b = [int(x) for x in a]
                if all(0 <= x <= 255 for x in b):
                    ans += 1

    print(ans)

if __name__ == '__main__':
    import sys
    solve(sys.stdin.buffer)