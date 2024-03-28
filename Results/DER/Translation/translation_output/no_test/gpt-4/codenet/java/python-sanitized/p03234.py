import sys

MOD = 10**9 + 7

class Reader:
    def __init__(self, file=None):
        self.file = open(file) if file else sys.stdin
        self.buffer = []

    def close(self):
        if self.file != sys.stdin:
            self.file.close()

    def readline(self):
        while not self.buffer:
            line = self.file.readline()
            if not line:
                return None
            self.buffer.extend(line.strip().split())
        return self.buffer.pop(0)

    def get_int(self):
        return int(self.readline())

    def get_long(self):
        return int(self.readline())


class Solve:
    def __init__(self, reader):
        self.reader = reader
        self.memo_ways_to_pair = [-1] * (2 * self.reader.get_int() + 1)
        self.k = self.reader.get_int()
        self.a = [0] * (self.k + 1)
        self.b = [0] * (self.k + 1)
        self.f = [0] * (2 * self.reader.get_int() + 1)
        self.dp = [[-1 for _ in range(len(self.f))] for _ in range(len(self.f))]
        
    def ways_to_pair(self, x):
        if self.memo_ways_to_pair[x] != -1:
            return self.memo_ways_to_pair[x]
        if x % 2 == 1:
            self.memo_ways_to_pair[x] = 0
        elif x == 0:
            self.memo_ways_to_pair[x] = 1
        else:
            self.memo_ways_to_pair[x] = (self.ways_to_pair(x - 2) * (x - 1)) % MOD
        return self.memo_ways_to_pair[x]

    def paired(self, x, y):
        return self.f[y] - self.f[x - 1]

    def inside(self, a, x, y):
        return x <= a <= y

    def caldp(self, x, y):
        if self.dp[x][y] != -1:
            return self.dp[x][y]

        not_paired_in_xy = (y - x + 1) - self.paired(x, y)
        
        for i in range(1, self.k + 1):
            p1 = self.inside(self.a[i], x, y)
            p2 = self.inside(self.b[i], x, y)
            if p1 != p2:
                self.dp[x][y] = 0
                return self.dp[x][y]
        
        self.dp[x][y] = self.ways_to_pair(not_paired_in_xy)
        
        for z in range(x + 1, y):
            not_paired_in_zy = (y - (z + 1) + 1) - self.paired(z + 1, y)
            self.dp[x][y] = (self.dp[x][y] - self.caldp(x, z) * self.ways_to_pair(not_paired_in_zy) + MOD * MOD) % MOD
            
        return self.dp[x][y]

    def main(self):
        for i in range(1, self.k + 1):
            self.a[i] = self.reader.get_int()
            self.b[i] = self.reader.get_int()
            self.f[self.a[i]] = 1
            self.f[self.b[i]] = 1
        
        for i in range(1, len(self.f)):
            self.f[i] += self.f[i - 1]
        
        res = 0
        for x in range(1, len(self.f)):
            for y in range(x, len(self.f)):
                not_paired_outside_xy = (len(self.f) - 1 - (y - x + 1)) - (self.f[-1] - self.paired(x, y))
                res = (res + self.caldp(x, y) * self.ways_to_pair(not_paired_outside_xy) % MOD) % MOD
        
        print(res)


if __name__ == "__main__":
    input_stream = None
    output_stream = None
    try:
        input_stream = open("input.txt", "r")
        output_stream = open("output.txt", "w")
    except FileNotFoundError:
        pass

    io = Reader(file="input.txt" if input_stream else None)
    solve_instance = Solve(io)
    solve_instance.main()
    io.close()

    if input_stream:
        input_stream.close()
    if output_stream:
        output_stream.close()