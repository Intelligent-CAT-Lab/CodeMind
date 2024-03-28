```python
MOD = 998244353

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except IOError as ex:
            raise UncheckedIOException(ex)

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOError as ex:
                raise UncheckedIOException(ex)

    def close(self):
        try:
            self.out.close()
        except IOError as ex:
            raise UncheckedIOException(ex)

class LightScanner:
    def __init__(self, inp):
        self.reader = None
        self.tokenizer = None
        self.reader = BufferedReader(InputStreamReader(inp))

    def string(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOError as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

class CShift:
    def solve(self, testNumber, in_, out):
        str_ = in_.chars()
        k = in_.ints()
        a = None
        n = None
        rlc = []
        count = 0
        
        for i in range(len(str_) - 1, -1, -1):
            if str_[i] == '0':
                rlc.append(count)
                count = 0
            else:
                count += 1
        rlc.append(count)
        n = len(rlc)
        a = [0] * n
        for i in range(n):
            a[i] = rlc[i]
            
        ones = n - 1
        zeros = len(str_) - ones
        if ones == 0 or zeros == 0:
            out.ans(1).ln()
            return
        
        dp = [[[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)] for _ in range(n + 1)]
        sum0 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
        sum1 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
        dp[0][0][0] = 1
        
        for i in range(n):
            # sum0
            for total in range(zeros + 1):
                sum0[total][0] = dp[i][total][0]
                for now in range(1, zeros + 1):
                    sum0[total][now] = (sum0[total][now - 1] + dp[i][total][now]) % MOD
            
            # sum1
            for total in range(zeros + 1):
                for now in range(zeros + 1):
                    sum1[total][now] = dp[i][total][now]
                    if total > 0 and now > 0:
                        sum1[total][now] += sum1[total - 1][now - 1]
                        sum1[total][now] %= MOD
            
            # thru
            for total in range(zeros + 1):
                dp[i + 1][total] = dp[i][total][:]
            
            # put
            for total in range(zeros + 1):
                for now in range(total + 1):
                    dp[i + 1][total][now] += (sum0[total][total] - sum0[total][now] + MOD)
                    dp[i + 1][total][now] %= MOD
            
            # take
            for total in range(1, zeros + 1):
                for now in range(1, total + 1):
                    min_val = min(total, min(now, a[i]))
                    for take in range(1, min_val + 1):
                        dp[i + 1][total][now] += dp[i][total - take][now - take]
                    dp[i + 1][total][now] %= MOD
                    
        ans = 0
        for i in range(min(k, zeros) + 1):
            ans += dp[n][i][0]
        out.ans(ans % MOD).ln()

# Test Input
input_data = "0101 1\n"

# Create InputStream
from io import BytesIO
input_stream = BytesIO(input_data.encode())

# Create LightScanner and LightWriter objects
in_ = LightScanner(input_stream)
out = LightWriter(BytesIO())

# Create CShift object and call solve method
solver = CShift()
solver.solve(1, in_, out)

# Get the output from the LightWriter buffer
output = out.out.getvalue().decode().strip()
print(output)
```
