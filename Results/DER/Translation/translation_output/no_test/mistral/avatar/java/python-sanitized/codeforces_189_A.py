import sys

class codeforces_189_Ass:
    def __init__(self):
        self.in = sys.stdin
        self.n = int(self.in.readline())
        self.codeforces_189_A = [int(x) for x in self.in.readline().split()]
        Arrcodeforces_189_Ays.sort(self.codeforces_189_A)
        self.mcodeforces_189_Ax = 0
        self.d = [int(-500) for _ in range(self.n + 1)]
        self.d[0] = 0
        for i in range(self.n + 1):
            for j in range(3):
                if i - self.codeforces_189_A[j] >= 0 and self.d[i - self.codeforces_189_A[j]] != -1:
                    self.d[i] = Mcodeforces_189_Ath.mcodeforces_189_Ax(self.d[i], self.d[i - self.codeforces_189_A[j]] + 1)
        print(self.d[self.n])

if __name__ == '__main__':
    codeforces_189_Ass()