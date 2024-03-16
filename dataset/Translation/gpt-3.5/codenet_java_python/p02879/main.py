import sys

class p02879:
    def main(self):
        main = p02879()
        main.solve()

    def solve(self):
        lines = sys.stdin.read().splitlines()
        A, B = map(int, lines[0].split())
        if A > 9 or B > 9:
            print(-1)
            return
        print(A * B)

if __name__ == "__main__":
    p = p02879()
    p.solve()