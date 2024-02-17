class main:
	class Twelvefold(): #n <= 1000程度
	    def __init__(self, n, mod, build=True):
	        self.mod = mod
	        self.fct = [0 for _ in range(n + 1)]
	        self.inv = [0 for _ in range(n + 1)]
	        self.fct[0] = 1
	        self.inv[0] = 1
	        for i in range(n):
	            self.fct[i + 1] = self.fct[i] * (i + 1) % mod
	        self.inv[n] = pow(self.fct[n], mod - 2, mod)
	        for i in range(n)[::-1]:
	            self.inv[i] = self.inv[i + 1] * (i + 1) % mod
	        if build: self.build()
	
	    def build(self):
	        self.stl = [[0 for j in range(n + 1)] for i in range(n + 1)]
	        self.bel = [[0 for j in range(n + 1)] for i in range(n + 1)]
	        self.prt = [[0 for j in range(n + 1)] for i in range(n + 1)]
	        self.stl[0][0] = 1
	        self.bel[0][0] = 1
	        for i in range(n):
	            for j in range(n):
	                self.stl[i + 1][j + 1] = self.stl[i][j] + (j + 1) * self.stl[i][j + 1]
	                self.stl[i + 1][j + 1] %= self.mod
	        for i in range(n):
	            for j in range(n):
	                self.bel[i + 1][j + 1] = self.bel[i + 1][j] + self.stl[i + 1][j + 1] % mod
	                self.bel[i + 1][j + 1] %= self.mod
	        for j in range(n):
	            self.prt[0][j] = 1
	        for i in range(n):
	            for j in range(n):
	                if i - j >= 0:
	                    self.prt[i + 1][j + 1] = self.prt[i + 1][j] + self.prt[i - j][j + 1]
	                else:
	                    self.prt[i + 1][j + 1] = self.prt[i + 1][j]
	                self.prt[i + 1][j + 1] %= self.mod
	
	    def solve(self, element, subset, equate_element=False, equate_subset=False, less_than_1=False, more_than_1=False):
	        assert not less_than_1 or not more_than_1
	        n = element
	        k = subset
	        a = equate_element
	        b = equate_subset
	        c = less_than_1
	        d = more_than_1
	        id = a * 3 + b * 6 + c + d * 2
	        tw = [self.tw1, self.tw2, self.tw3, self.tw4, self.tw5, self.tw6, self.tw7, self.tw8, self.tw9, self.tw10, self.tw11, self.tw12]
	        return tw[id](n, k)
	
	    def tw1(self, n, k):
	        return pow(k, n, self.mod)
	
	    def tw2(self, n, k):
	        if k - n < 0: return 0
	        return self.fct[k] * self.inv[k - n] % self.mod
	
	    def tw3(self, n, k):
	        return self.stl[n][k] * self.fct[k] % self.mod
	
	    def tw4(self, n, k):
	        if k == 0: return 0
	        return self.fct[n + k - 1] * self.inv[n] * self.inv[k - 1] % self.mod
	
	    def tw5(self, n, k):
	        if k - n < 0: return 0
	        return self.fct[k] * self.inv[n] * self.inv[k - n] % self.mod
	
	    def tw6(self, n, k):
	        if n - k < 0 or k == 0: return 0
	        return self.fct[n - 1] * self.inv[k - 1] * self.inv[n - k]
	
	    def tw7(self, n, k):
	        return self.bel[n][k]
	
	    def tw8(self, n, k):
	        if k - n < 0: return 0
	        return 1
	
	    def tw9(self, n, k):
	        return self.stl[n][k]
	
	    def tw10(self, n, k):
	        return self.prt[n][k]
	
	    def tw11(self, n, k):
	        if k - n < 0: return 0
	        return 1
	
	    def tw12(self, n, k):
	        if n - k < 0: return 0
	        return self.prt[n - k][k]
	
	n, k = list(map(int, input().split()))
	t = Twelvefold(2000, 10**9 + 7, 0)
	print((t.solve(n, k, 1, 0, 0, 0)))
