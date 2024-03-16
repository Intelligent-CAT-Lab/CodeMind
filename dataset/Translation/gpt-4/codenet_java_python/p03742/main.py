import sys
import io

MOD = int(1e9) + 7

def printlnYN(b):
    print("Brown" if b else "Alice")

dp = [[False] * 100 for _ in range(100)]
visited = [[False] * 100 for _ in range(100)]

def dfs(x, y):
    if visited[x][y]:
        return dp[x][y]
    if x <= 1 and y <= 1:
        dp[x][y] = False
        visited[x][y] = True
        return False

    for i in range(2, x+1, 2):
        if not dfs(x-i, y+i//2):
            dp[x][y] = True
            visited[x][y] = True
            return True

    for i in range(2, y+1, 2):
        if not dfs(x+i//2, y-i):
            dp[x][y] = True
            visited[x][y] = True
            return True

    dp[x][y] = False
    visited[x][y] = True
    return False

def solve(X, Y):
    printlnYN(abs(X - Y) <= 1)

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.input = io.StringIO(stream.read())

    def _read(self):
        return self.input.readline().strip()

    def next_str(self):
        return self._read()

    def next_int(self):
        return int(self.next_str())

    def next_long(self):
        return int(self.next_str())

    def next_double(self):
        return float(self.next_str())

    def next_char(self):
        return self._read()[0]

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

def main():
    # Uncomment below lines if input is needed.
    # INPUT STREAM OVERWRITTEN FOR ONLINE-JUDGE PURPOSES.
    # In an interactive/local environment, you can use input() instead.
    # in_stream = io.StringIO(sys.stdin.read())
    # in_scanner = FastScanner(in_stream)
    # X, Y = in_scanner.next_long(), in_scanner.next_long()
    
    # Direct input variant for local testing:
    X, Y = map(int, input().split())
    
    solve(X, Y)
    
if __name__ == '__main__':
    main()