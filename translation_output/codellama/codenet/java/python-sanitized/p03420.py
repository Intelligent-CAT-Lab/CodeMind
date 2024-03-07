import sys

class TaskD:
    def solve(self, test_number, inp, out):
        n, K = map(int, inp.readline().split())
        ans = 0
        for i in range(K+1, n+1):
            for j in range(0, n//i+1):
                if i*(j+1)-1 <= n:
                    ans += i-K
                else:
                    ans += max(i-K-(i*(j+1)-1-n), 0)
        if K == 0:
            ans -= n
        out.write(str(ans) + '\n')

if __name__ == '__main__':
    inp = sys.stdin
    out = sys.stdout
    TaskD().solve(1, inp, out)