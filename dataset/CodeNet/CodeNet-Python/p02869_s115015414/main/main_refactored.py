class main:
	import sys
	readline = sys.stdin.readline        
	
	from itertools import accumulate
	from collections import Counter
	from bisect import bisect as br, bisect_left as bl
	class PMS:
	    #1-indexed
	    def __init__(self, A, B, issum = False):
	        #Aに初期状態の要素をすべて入れる,Bは値域のリスト
	        self.X, self.comp = self.compress(B)
	        self.size = len(self.X)
	        self.tree = [0] * (self.size + 1)
	        self.p = 2**(self.size.bit_length() - 1)
	        self.dep = self.size.bit_length()
	        
	        CA = Counter(A)
	        S = [0] + list(accumulate([CA[self.X[i]] for i in range(self.size)]))
	        for i in range(1, 1+self.size):
	            self.tree[i] = S[i] - S[i - (i&-i)]
	        if issum:
	            self.sumtree = [0] * (self.size + 1)
	            Ssum = [0] + list(accumulate([CA[self.X[i]]*self.X[i] for i in range(self.size)]))
	            for i in range(1, 1+self.size):
	                self.sumtree[i] = Ssum[i] - Ssum[i - (i&-i)]
	    
	    def compress(self, L):
	        #座圧
	        L2 = list(set(L))
	        L2.sort()
	        C = {v : k for k, v in enumerate(L2, 1)}
	        # 1-indexed
	        return L2, C
	    
	    def leng(self):
	        #今入っている個数を取得
	        return self.count(self.X[-1])
	    
	    def count(self, v):
	        #v(Bの元)以下の個数を取得
	        i = self.comp[v]
	        s = 0
	        while i > 0:
	            s += self.tree[i]
	            i -= i & -i
	        return s
	    
	    def less(self, v):
	        #v(Bの元である必要はない)未満の個数を取得
	        i = bl(self.X, v)
	        s = 0
	        while i > 0:
	            s += self.tree[i]
	            i -= i & -i
	        return s
	    
	    def leq(self, v):
	        #v(Bの元である必要はない)以下の個数を取得
	        i = br(self.X, v)
	        s = 0
	        while i > 0:
	            s += self.tree[i]
	            i -= i & -i
	        return s
	 
	    def add(self, v, x):
	        #vをx個入れる,負のxで取り出す,iの個数以上取り出すとエラーを出さずにバグる
	        i = self.comp[v]
	        while i <= self.size:
	            self.tree[i] += x
	            i += i & -i
	
	    def get(self, i):
	        # i番目の値を取得
	        if i <= 0:
	            return -1
	        s = 0
	        k = self.p
	        for _ in range(self.dep):
	            if s + k <= self.size and self.tree[s+k] < i:
	                s += k
	                i -= self.tree[s]
	            k //= 2
	        return self.X[s]
	    
	    def gets(self, v):
	        #累積和がv以下となる最大のindexを返す
	        v1 = v
	        s = 0
	        k = self.p
	        for _ in range(self.dep):
	            if s + k <= self.size and self.sumtree[s+k] < v:
	                s += k
	                v -= self.sumtree[s]
	            k //= 2
	        if s == self.size:
	            return self.leng()
	        return self.count(self.X[s]) + (v1 - self.countsum(self.X[s]))//self.X[s]
	    
	    def addsum(self, i, x):
	        #sumを扱いたいときにaddの代わりに使う
	        self.add(i, x)
	        x *= i
	        i = self.comp[i]
	        while i <= self.size:
	            self.sumtree[i] += x
	            i += i & -i
	    
	    def countsum(self, v):
	        #v(Bの元)以下のsumを取得
	        i = self.comp[v]
	        s = 0
	        while i > 0:
	            s += self.sumtree[i]
	            i -= i & -i
	        return s
	    
	    def getsum(self, i):
	        #i番目までのsumを取得
	        x = self.get(i)
	        return self.countsum(x) - x*(self.count(x) - i)
	
	
	N, K = list(map(int, readline().split()))
	C = list(range(K+2*N, K+3*N))
	A = list(range(K, K+N))
	B = list(range(K+N, K+2*N))
	Ans = []
	ans = 1
	
	BB = PMS(B, B)
	if sum(A) + sum(B) > sum(C):
	    ans = -1
	else:
	    Ao = [A[i] for i in range(N) if A[i]%2]
	    Ae = [A[i] for i in range(N) if not A[i]%2]
	    if len(Ao) < len(Ae):
	        AA = Ae + Ao
	    else:
	        AA = Ao + Ae
	    
	    for a, c in zip(AA, C):
	        bx = c - a
	        k = BB.leq(bx)
	        if k == 0:
	            ans = -1
	            break
	        b = BB.get(k)
	        Ans.append((a, b, c))
	        BB.add(b, -1)
	
	if ans != -1:
	    print(('\n'.join('{} {} {}'.format(*an) for an in Ans)))
	else:
	    print(ans)
