import sys

class Methods:

    def print(self, *ar):
        print(ar)

    def yesno(self, out, b):
        out.write("Yes\n" if b else "No\n")

    def YESNO(self, out, b):
        out.write("YES\n" if b else "NO\n")

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)


class p02430:

    def solve(self, in_, out, ms):

        n, k = map(int, in_.split())

        for bit in range(1 << n):
            if bin(bit).count('1') != k:
                continue
            out.write(f"{bit}:")
            for j in range(n):
                if ((bit >> j) & 1) == 1:
                    out.write(f" {j}")
            out.write('\n')


if __name__ == "__main__":
    main = p02430()
    in_ = sys.stdin.readline
    out = sys.stdout
    ms = Methods()
    main.solve(in_, out, ms)
    out.flush()