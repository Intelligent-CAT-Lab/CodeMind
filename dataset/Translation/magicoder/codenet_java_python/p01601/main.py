import sys

class p01601:

    INF = 1 << 28
    #long INF = 1L << 62;
    EPS = 1e-10

    def run(self):
        n = int(input())
        for i in range(100000):
            if self.isPalin(str(n-i)):
                print(n-i)
                break
            if self.isPalin(str(n+i)):
                print(n+i)
                break

    def isPalin(self, s):
        for i in range(len(s)//2):
            if s[i] != s[-i-1]:
                return False
        return True

    def debug(self, *os):
        print(os, file=sys.stderr)

if __name__ == '__main__':
    p01601().run()