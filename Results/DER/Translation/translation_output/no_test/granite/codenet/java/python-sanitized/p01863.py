import java.util.Arrays;
import java.util.Scanner;

class p01863:
    def __init__(self):
        self.sc = Scanner(System.in)
        self.sc2 = Scanner(System.in)
        self.start = System.currentTimeMillis()
        self.fin = System.currentTimeMillis()
        self.MOD = 1000000007
        self.dx = [1, 0, 0, -1]
        self.dy = [0, 1, -1, 0]

    def run(self):
        s = self.sc.next()
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
                a1 = rh.getHash2(0, A - 1)
                b1 = rh.getHash2(A, A + B - 1)
                a2 = rh.getHash2(A + B, A + B + A - 1)
                b2 = rh.getHash2(A + B + A, A + B + A + B - 1)
                a3 = rh.getHash2(A + B + A + B, N - 1)
                if a1 == a2 and a2 == a3 and b1 == b2:
                    ans = min(ans, i + t)
                    l = A
                    r = B
        if l!= 0 and r!= 0:
            res = "Love " + s[:l] + s[l:l + r] + "!"
        print(res)

class RollingHash:
    def __init__(self):
        pass

    def init(self, s):
        self.S = s
        self.N = len(s)
        self.l = 0
        self.r = self.N - 1
        self.Base1 = 1007
        self.Base2 = 1009
        self.H1 = 1000000007
        self.H2 = 1000000009
        self.Base1 = [1] * (self.N + 1)
        self.Base2 = [1] * (self.N + 1)
        self.Hash1 = [0] * self.N
        self.Hash2 = [0] * self.N
        self.Base1[0] = self.Base2[0] = 1
        self.Hash1[0] = self.Hash2[0] = ord(s[0])
        for i in range(1, self.N):
            self.Base1[i] = (self.Base1[i - 1] * self.Base1) % self.H1
            self.Base2[i] = (self.Base2[i - 1] * self.Base2) % self.H2
        for i in range(1, self.N):
            self.Hash1[i] = (self.Hash1[i - 1] * self.Base1 + ord(s[i])) % self.H1
            self.Hash2[i] = (self.Hash2[i - 1] * self.Base2 + ord(s[i])) % self.H2

    def contain1(self, T):
        sl = len(self.S)
        tl = len(T)
        if tl > sl:
            return False
        b = 1
        for i in range(tl):
            b = (b * self.Base1) % self.H1
        sh = 0
        th = 0
        for i in range(tl):
            sh = (sh * self.Base1 + ord(self.S[i])) % self.H1
        for i in range(tl):
            th = (th * self.Base1 + ord(T[i])) % self.H1
        for i in range(sl - tl + 1):
            if sh == th:
                return True
            if i + tl < sl:
                sh = sh * self.Base1 - (ord(self.S[i]) * b) + ord(self.S[i + tl])
            sh = (sh + self.H1) % self.H1
        return False

    def contain2(self, T):
        sl = self.N
        tl = len(T)
        if tl > sl:
            return False
        th = 0
        for i in range(tl):
            th = (th * self.Base1 + ord(T[i])) % self.H1
        self.r = tl - 1
        self.l = 0
        for i in range(self.r, self.N):
            if self.getHash1() == th:
                return True
            if i + tl < self.N:
                self.l += 1
                self.r += 1
                self.Hash1[self.l - 1] = (self.Hash1[self.l - 1] * self.Base1 - (ord(self.S[self.l - 1]) * self.Base1[tl]) + ord(self.S[self.r])) % self.H1
                if self.Hash1[self.l - 1] < 0:
                    self.Hash1[self.l - 1] = (self.Hash1[self.l - 1] + self.H1) % self.H1
        self.l = 0
        self.r = self.N - 1
        return False

    def getHash1(self):
        res = self.Hash1[self.r] - ((self.l == 0) and 0 or self.Hash1[self.l - 1] * self.Base1[self.r - self.l + 1])
        if res < 0:
            res = (res + ((-res // self.H1) + 1) * self.H1) % self.H1
        return res

    def getHash1(self, l, r):
        res = self.Hash1[r] - ((self.l == 0) and 0 or self.Hash1[self.l - 1] * self.Base1[r - self.l + 1])
        if res < 0:
            res = (res + ((-res // self.H1) + 1) * self.H1) % self.H1
        return res

    def getHash2(self):
        res = self.Hash2[self.r] - ((self.l == 0) and 0 or self.Hash2[self.l - 1] * self.Base2[self.r - self.l + 1])
        if res < 0:
            res = (res + ((-res // self.H2) + 1) * self.H2) % self.H2
        return res

    def getHash2(self, l, r):
        res = self.Hash2[r] - ((self.l == 0) and 0 or self.Hash2[self.l - 1] * self.Base2[self.r - self.l + 1])
        if res < 0:
            res = (res + ((-res // self.H2) + 1) * self.H2) % self.H2
        return res

    def show(self):
        print("---------show---------")
        print("String = " + self.S[self.l:self.r + 1])
        print("l = " + str(self.l) + " r = " + str(self.r))
        print("Hash1 = " + str(self.getHash1()) + " Hash2 = " + str(self.getHash2()) + "----------------------")

    def debug(self, *o):
        print(Arrays.deepToString(o))

    def debug2(self, char[][] array):
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------");

    def inner(int h, int w, int limH, int limW):
        return 0 <= h && h < limH && 0 <= w && w < limW;

    def swap(int[] x, int a, int b):
        int tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;

    def lower_bound(int[] x, int k):
        int l = -1;
        int r = x.length;
        while (r