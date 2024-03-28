import sys

class p03666:
    def solve(self):
        N = int(sys.stdin.readline())
        A, B, C, D = map(int, sys.stdin.readline().split())

        for i in range(N):
            max_val = D * (N - 1 - i) - C * i
            min_val = C * (N - 1 - i) - D * i
            if abs(B - A) >= min_val and abs(B - A) <= max_val:
                print("YES")
                return
        print("NO")

if __name__ == "__main__":
    p03666().solve()