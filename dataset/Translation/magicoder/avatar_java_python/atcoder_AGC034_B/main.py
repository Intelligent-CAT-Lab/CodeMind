import sys

class BABC:
    def solve(self, testNumber, inp, out):
        s = inp.readline().replace('BC', 'D')
        cnt = 0
        tmp = 0
        for i in range(len(s)):
            if s[i] == 'A':
                tmp += 1
            elif s[i] == 'D':
                cnt += tmp
            else:
                tmp = 0
        out.write(str(cnt) + '\n')

if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = BABC()
    solver.solve(1, inp, out)
    out.close()