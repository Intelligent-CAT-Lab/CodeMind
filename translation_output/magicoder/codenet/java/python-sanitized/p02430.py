import sys

class p02430:

    def solve(self, inp, out, ms):
        n, k = map(int, inp.readline().split())

        for bit in range(1 << n):
            if bin(bit).count('1') != k:
                continue
            out.write(str(bit) + ':')
            for j in range(n):
                if ((bit >> j) & 1) == 1:
                    out.write(' ' + str(j))
            out.write('\n')


if __name__ == "__main__":
    main = p02430()
    inp = sys.stdin
    out = sys.stdout
    ms = Methods()
    main.solve(inp, out, ms)


class Methods:

    def print(self, *ar):
        print(ar)

    def yesno(self, out, b):
        out.write(b and 'Yes' or 'No')

    def YESNO(self, out, b):
        out.write(b and 'YES' or 'NO')

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)