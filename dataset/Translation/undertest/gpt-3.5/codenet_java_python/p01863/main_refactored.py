class main:
    MOD = 1000000007
    dx = [1, 0, 0, -1]
    dy = [0, 1, -1, 0]
    
    class RollingHash:
        def __init__(self):
            self.S = ""
            self.N = 0
            self.l = 0
            self.r = 0
            self.B1 = 1007
            self.B2 = 1009
            self.H1 = 1000000007
            self.H2 = 1000000009
            self.Base1 = []
            self.Base2 = []
            self.Hash1 = []
            self.Hash2 = []
    
        def init(self, s):
            self.S = s
            self.N = len(s)
            self.l = 0
            self.r = len(s) - 1
            self.Base1 = [0] * (self.N + 1)
            self.Base2 = [0] * (self.N + 1)
            self.Hash1 = [0] * self.N
            self.Hash2 = [0] * self.N
    
            self.Base1[0] = self.Base2[0] = 1
            self.Hash1[0] = self.Hash2[0] = ord(s[0])
            for i in range(1, self.N + 1):
                self.Base1[i] = (self.Base1[i - 1] * self.B1) % self.H1
            for i in range(1, self.N + 1):
                self.Base2[i] = (self.Base2[i - 1] * self.B2) % self.H2
            for i in range(1, self.N):
                self.Hash1[i] = (self.Hash1[i - 1] * self.B1 + ord(s[i])) % self.H1
            for i in range(1, self.N):
                self.Hash2[i] = (self.Hash2[i - 1] * self.B2 + ord(s[i])) % self.H2
    
        def contain1(self, T):
            sl = len(self.S)
            tl = len(T)
            if tl > sl:
                return False
    
            b = 1
            for i in range(tl):
                b = (b * self.B1) % self.H1
    
            sh = 0
            th = 0
            for i in range(tl):
                sh = (sh * self.B1 + ord(self.S[i])) % self.H1
            for i in range(tl):
                th = (th * self.B1 + ord(T[i])) % self.H1
    
            for i in range(sl - tl + 1):
                if sh == th:
                    return True
                if i + tl < sl:
                    sh = sh * self.B1 - ord(self.S[i]) * b + ord(self.S[i + tl])
                sh = (sh + self.H1) % self.H1
            return False
    
        def contain2(self, T):
            sl = self.N
            tl = len(T)
            if tl > sl:
                return False
    
            th = 0
            for i in range(tl):
                th = (th * self.B1 + ord(T[i])) % self.H1
    
            self.r = tl - 1
            self.l = 0
            for _ in range(self.N - tl + 1):
                if self.getHash1() == th:
                    return True
                self.r += 1
                self.l += 1
            self.l = 0
            self.r = len(self.S) - 1
            return False
    
        def getHash1(self):
            res = self.Hash1[self.r] - (0 if self.l == 0 else self.Hash1[self.l - 1] * self.Base1[self.r - self.l + 1])
            if res < 0:
                res = (res + ((-res // self.H1) + 1) * self.H1) % self.H1
            return res
    
        def getHash1_lr(self, l, r):
            res = self.Hash1[r] - (0 if l == 0 else self.Hash1[l - 1] * self.Base1[r - l + 1])
            if res < 0:
                res = (res + ((-res // self.H1) + 1) * self.H1) % self.H1
            return res
    
        def getHash2(self):
            res = self.Hash2[self.r] - (0 if self.l == 0 else self.Hash2[self.l - 1] * self.Base2[self.r - self.l + 1])
            if res < 0:
                res = (res + ((-res // self.H2) + 1) * self.H2) % self.H2
            return res
    
        def getHash2_lr(self, l, r):
            res = self.Hash2[r] - (0 if l == 0 else self.Hash2[l - 1] * self.Base2[r - l + 1])
            if res < 0:
                res = (res + ((-res // self.H2) + 1) * self.H2) % self.H2
            return res
    
    def main():
        s = input()
        N = len(s)
        rh = RollingHash()
        rh.init(s)
        ans = float('inf')
        res = "mitomerarenaiWA"
        l = 0
        r = 0
        for i in range(N):
            t = N - (i + 1) * 3
            if t > 0 and t % 2 == 0:
                A = i + 1
                B = t // 2
                a1 = rh.getHash2_lr(0, A - 1)
                b1 = rh.getHash2_lr(A, A + B - 1)
                a2 = rh.getHash2_lr(A + B, A + B + A - 1)
                b2 = rh.getHash2_lr(A + B + A, A + B + A + B - 1)
                a3 = rh.getHash2_lr(A + B + A + B, N - 1)
                if a1 == a2 == a3 and b1 == b2:
                    ans = min(ans, i + t)
                    l = A
                    r = B
        if l != 0 and r != 0:
            res = "Love " + s[0:l] + s[l:l+r] + "!"
        print(res)
    
    if __name__ == "__main__":
        main()