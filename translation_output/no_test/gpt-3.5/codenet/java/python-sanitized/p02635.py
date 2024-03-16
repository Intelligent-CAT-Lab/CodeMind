import sys
from io import BytesIO, TextIOWrapper
import os


class LightScanner:
    def __init__(self, stream):
        self.input = TextIOWrapper(BytesIO(stream.read()))
        self.buffer = []

    def string(self):
        while not self.buffer or len(self.buffer) == self.pos:
            self.buffer = self.input.readline().split()
            self.pos = 0
        value = self.buffer[self.pos]
        self.pos += 1
        return value

    def chars(self):
        return self.string().toCharArray()

    def ints(self):
        return int(self.string())

    def close(self):
        self.input.close()


class LightWriter:
    def __init__(self, stream):
        self.out = stream

    def print(self, c):
        self.out.write(c)

    def print_string(self, s):
        self.out.write(s)

    def ans(self, s):
        self.print(' ' if not self.autoflush else '')
        self.print_string(s)

    def ans_int(self, i):
        self.ans(str(i))

    def ln(self):
        self.print(os.linesep)

    def close(self):
        self.out.close()


def main():
    in_stream = sys.stdin.buffer
    out_stream = sys.stdout.buffer
    in_scanner = LightScanner(in_stream)
    out_writer = LightWriter(out_stream)
    solver = CShift()
    solver.solve(1, in_scanner, out_writer)
    out_writer.close()


class CShift:
    MOD = 998244353

    def solve(self, test_number, in_scanner, out_writer):
        str_input = in_scanner.chars()
        k = in_scanner.ints()
        a = []
        n = 0
        rlc = []
        count = 0

        for i in range(len(str_input) - 1, -1, -1):
            if str_input[i] == '0':
                rlc.append(count)
                count = 0
            else:
                count += 1

        rlc.append(count)
        n = len(rlc)
        a = [rlc[i] for i in range(n)]

        ones = n - 1
        zeros = len(str_input) - ones
        if ones == 0 or zeros == 0:
            out_writer.ans_int(1).ln()
            return

        dp = [[[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)] for _ in range(n + 1]
        sum0 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]
        sum1 = [[0 for _ in range(zeros + 1)] for _ in range(zeros + 1)]

        dp[0][0][0] = 1
        for i in range(n):
            for total in range(zeros + 1):
                sum0[total][0] = dp[i][total][0]
                for now in range(1, zeros + 1):
                    sum0[total][now] = (sum0[total][now - 1] + dp[i][total][now]) % self.MOD

            for total in range(zeros + 1):
                for now in range(zeros + 1):
                    sum1[total][now] = dp[i][total][now]
                    if total > 0 and now > 0:
                        sum1[total][now] += sum1[total - 1][now - 1]
                        sum1[total][now] %= self.MOD

            for total in range(zeros + 1):
                dp[i + 1][total] = list(dp[i][total])

            for total in range(zeros + 1):
                for now in range(total + 1):
                    dp[i + 1][total][now] += (sum0[total][total] - sum0[total][now] + self.MOD)
                    dp[i + 1][total][now] %= self.MOD

            for total in range(1, zeros + 1):
                for now in range(1, total + 1):
                    minimum = min(total, min(now, a[i]))
                    for take in range(1, minimum + 1):
                        dp[i + 1][total][now] += dp[i][total - take][now - take]

                    dp[i + 1][total][now] %= self.MOD

        ans = 0
        for i in range(min(k, zeros) + 1):
            ans += dp[n][i][0]
        out_writer.ans_int(ans % self.MOD).ln()


if __name__ == "__main__":
    main()