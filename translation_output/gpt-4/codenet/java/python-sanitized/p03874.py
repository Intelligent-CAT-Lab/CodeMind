import sys
import threading

class P03874:
    def __init__(self):
        self.festival_length = len("FESTIVAL")

    def solve(self, k):
        m = self.festival_length
        n = 600
        l = m - 1
        dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
        for i in range(n):
            dp[i][0] = 1
            for j in range(l):
                for p in range(i + 1):
                    for q in range(j + 1):
                        dp[i + 1][j + 1] += dp[p][q]

        a = [0 for _ in range(n + 1)]
        for i in range(n, 0, -1):
            a[i] = k // dp[i][l]
            k -= a[i] * dp[i][l]

        result = []
        for i in range(1, n + 1):
            result.append("FESTIVA")
            result.append("L" * a[i])

        return ''.join(result)

    def check(self, s):
        t = "FESTIVAL"
        m = len(t)
        map = [0] * 26
        for i, c in enumerate(t):
            map[ord(c) - ord('A')] = i

        n = len(s)
        a = [0] * n
        for i, c in enumerate(s):
            a[i] = map[ord(c) - ord('A')]

        dp = [[0 for _ in range(m + 1)] for _ in range(n + 1)]
        dp[0][0] = 1
        for i in range(n):
            for j in range(m + 1):
                dp[i + 1][j] = dp[i][j]
            dp[i + 1][a[i] + 1] += dp[i][a[i]]

        return dp[n][m]

def main(input_stream):
    p03874 = P03874()
    for line in input_stream:
        k = int(line.strip())
        print(p03874.solve(k))


def input_reader(file_path=None):
    if file_path:
        with open(file_path, 'r') as file:
            for line in file:
                yield line.strip()
    else:
        for line in sys.stdin:
            yield line.strip()

if __name__ == "__main__":
    arg = sys.argv[1] if len(sys.argv) > 1 else None
    input_stream = input_reader(arg)
    threading.stack_size(64000000)
    thread = threading.Thread(target=main, args=(input_stream,))
    thread.start()