class main:
	from collections import Counter
	import sys
	sys.setrecursionlimit(10**6)
	
	MOD = 998244353
	
	ABC = "abc".index
	*S, = list(map(ABC, eval(input())))
	N = len(S)
	
	def bruteforce(S):
	    used = set()
	    def dfs(s):
	        key = tuple(s)
	        if key in used:
	            return
	        used.add(key)
	        for i in range(len(s)-1):
	            if s[i] != s[i+1]:
	                a = s[i]; b = s[i+1]
	                s[i] = s[i+1] = 3 - a - b
	                dfs(s)
	                s[i] = a; s[i+1] = b
	    dfs(S)
	    return len(used)
	
	if len(S) <= 3:
	    print((bruteforce(S)))
	else:
	    c = Counter(S)
	    if c[0] == N or c[1] == N or c[2] == N:
	        print((1))
	    else:
	        P = [[[0,0] for i in range(3)] for j in range(3)]
	        Q = [[[0,0] for i in range(3)] for j in range(3)]
	        P[0][0][0] = P[1][1][0] = P[2][2][0] = 1
	        for i in range(N-1):
	            for p in range(3):
	                for q in range(3):
	                    for r in range(2):
	                        Q[p][q][r] = 0
	            for p in range(3):
	                for q in range(3):
	                    for r in range(2):
	                        for k in range(3):
	                            Q[k][(q+k)%3][r | (p == k)] += P[p][q][r] % MOD
	            P, Q = Q, P
	        ans = 0
	        r = sum(S) % 3
	        for i in range(3):
	            ans += P[i][r][1]
	        if all(S[i] != S[i+1] for i in range(N-1)):
	            ans += 1
	        print((ans % MOD))