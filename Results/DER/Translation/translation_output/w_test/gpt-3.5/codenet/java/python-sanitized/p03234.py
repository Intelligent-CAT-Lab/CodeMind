class Solve:
    
    mod = int(1e9+7)
    
    def __init__(self, io):
        self.io = io
    
    def ways_to_pair(self, x):
        if self.memo_ways_to_pair[x] is not None:
            return self.memo_ways_to_pair[x]
        
        if x % 2 == 1:
            self.memo_ways_to_pair[x] = 0
        elif x == 0:
            self.memo_ways_to_pair[x] = 1
        else:
            self.memo_ways_to_pair[x] = self.ways_to_pair(x - 2) * (x - 1) % self.mod
        
        return self.memo_ways_to_pair[x]
    
    def paired(self, x, y):
        return self.f[y] - self.f[x - 1]
    
    def inside(self, a, x, y):
        return x <= a and a <= y
    
    def cal_dp(self, x, y):
        if self.dp[x][y] is not None:
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
            self.dp[x][y] = (self.dp[x][y] - self.cal_dp(x, z) * self.ways_to_pair(not_paired_in_zy) + self.mod * self.mod) % self.mod
        
        return self.dp[x][y]
        
    def main(self):
        self.n = self.io.get_int()
        self.n *= 2
        self.k = self.io.get_int()
        self.a = [0] * (self.k + 1)
        self.b = [0] * (self.k + 1)
        self.f = [0] * (self.n + 1)
        
        for i in range(1, self.k + 1):
            self.a[i] = self.io.get_int()
            self.b[i] = self.io.get_int()
            self.f[self.a[i]] = 1
            self.f[self.b[i]] = 1
        
        for i in range(1, self.n + 1):
            self.f[i] += self.f[i - 1]
        
        self.dp = [[None for _ in range(self.n + 1)] for _ in range(self.n + 1)]
        
        self.memo_ways_to_pair = [None] * (self.n + 1)
        
        res = 0
        for x in range(1, self.n + 1):
            for y in range(x, self.n + 1):
                not_paired_outside_xy = (self.n - (y - x + 1)) - (self.f[self.n] - self.paired(x, y))
                res = (res + self.cal_dp(x, y) * self.ways_to_pair(not_paired_outside_xy) % self.mod) % self.mod
        
        self.io.print(res)

# Code to handle input and output
class Kattio:
    
    def __init__(self, i):
        self.r = i
    
    def has_more_tokens(self):
        return self.peek_token() is not None
    
    def get_int(self):
        return int(self.next_token())
    
    def get_double(self):
        return float(self.next_token())
    
    def get_long(self):
        return int(self.next_token())
    
    def get_word(self):
        return self.next_token()
    
    def peek_token(self):
        if not self.token:
            try:
                while not self.st or not self.st.hasMoreTokens():
                    self.line = self.r.readline()
                    if not self.line:
                        return None
                    self.st = self.line.split()
                self.token = self.st.pop(0)
            except Exception as e:
                pass
        return self.token
    
    def next_token(self):
        ans = self.peek_token()
        self.token = None
        return ans