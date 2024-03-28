import sys


class BABC:
    def solve(self, testNumber, in, out):
        s = in.next().replace('BC', 'D')
        cnt = 0
        tmp = 0
        for i in range(len(s)):
            if s[i] == 'A':
                tmp += 1
            elif s[i] == 'D':
                cnt += tmp
            else:
                tmp = 0
        out.println(cnt)


if __name__ == '__main__':
    in = sys.stdin.readline
    out = sys.stdout.write
    solver = BABC()
    solver.solve(int(in()), in, out)