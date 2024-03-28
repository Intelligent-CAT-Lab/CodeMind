import sys

class p00509:

    def __init__(self):
        self.run()

    def run(self):
        n = int(sys.stdin.readline().strip())
        c = int(sys.stdin.readline().strip())
        num = [0]*n
        if c < 0:
            if n == 1:
                print(11)
            else:
                print('9'* (n * 2))
        else:
            a = 10 ** n
            b = a // 10
            a -= 1
            for i in range(a, b-1, -1):
                if self.check(i, c):
                    return

    def check(self, i, c):
        s = str(i)
        s_rev = s[::-1]
        s_new = s + str(c) + s_rev
        if self.prime(int(s_new)):
            print(s_new)
            return True
        else:
            return False

    def prime(self, b):
        for i in range(2, int(b**0.5)+1):
            if b % i == 0:
                return False
        return True

p00509()