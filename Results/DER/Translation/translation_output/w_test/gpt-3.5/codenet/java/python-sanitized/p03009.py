class FastInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.input_stream.readinto(self.buf)
            except IOError as e:
                self.buf_len = -1
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next == ord('+') or self.next == ord('-'):
            sign = 1 if self.next == ord('+') else -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while self.next >= ord('0') and self.next <= ord('9'):
                val = val * 10 + self.next - ord('0')
                self.next = self.read()
        else:
            while self.next >= ord('0') and self.next <= ord('9'):
                val = val * 10 - self.next + ord('0')
                self.next = self.read()

        return val


class FastOutput:
    def __init__(self, output_stream):
        self.cache = []
        self.output_stream = output_stream

    def println(self, c):
        self.cache.append(str(c) + '\n')
        return self

    def flush(self):
        try:
            self.output_stream.write(''.join(self.cache))
            self.output_stream.flush()
            self.cache = []
        except IOError as e:
            raise UncheckedIOException(e)

    def close(self):
        self.flush()
        try:
            self.output_stream.close()
        except IOError as e:
            raise UncheckedIOException(e)

def solve(n, h, d, out):
    mod = 10**9 + 7
    fact = [1] * (n + 1)
    for i in range(2, n + 1):
        fact[i] = (fact[i - 1] * i) % mod

    dp = [0] * (h + 1)
    fact_sum = sum(fact[1:n + 1]) % mod

    pre_dp_sum = [0] * (h + 1)
    dp[0] = fact[n]

    for i in range(1, h + 1):
        dp[i] = pre_dp_sum[i - 1]
        if i - d - 1 >= 0:
            dp[i] = (dp[i] - pre_dp_sum[i - d - 1] + mod) % mod
        if i < h:
            dp[i] = (dp[i] * fact_sum) % mod
        pre_dp_sum[i] = (pre_dp_sum[i - 1] + dp[i]) % mod

    out.println(dp[h])

input_stream = open(0)
output_stream = open(1, 'w')
in_obj = FastInput(input_stream)
out_obj = FastOutput(output_stream)
n = in_obj.read_int()
h = in_obj.read_int()
d = in_obj.read_int()
solve(n, h, d, out_obj)
out_obj.close()