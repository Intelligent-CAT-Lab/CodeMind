import sys

class TaskD:
    def solve(self, testNumber, in, out):
        s = in.next()
        d = [len(s) for i in range(1 << 26)]
        d[0] = 0
        mask = 0
        ans = len(s)
        for i in range(len(s)):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = j < 0? 0 : (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == len(s) - 1:
                    ans = min(ans, cur)
        out.println(ans)

if __name__ == '__main__':
    t = TaskD()
    t.solve(1, sys.stdin, sys.stdout)