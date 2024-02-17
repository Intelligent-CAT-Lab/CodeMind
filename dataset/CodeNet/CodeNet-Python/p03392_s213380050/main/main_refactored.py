class main:
	import sys
	input = sys.stdin.readline
	
	import numpy as np
	
	MOD = 998244353
	
	S = input().rstrip()
	
	arr = np.array(list(S.replace('a','0').replace('b','1').replace('c','2')),dtype=np.int32)
	
	if (arr == arr[0]).all():
	    print((1))
	    exit()
	
	def solve_naive(S):
	    se = set([S])
	    q = [S]
	    while q:
	        S = q.pop()
	        for i in range(len(S)-1):
	            x,y = S[i:i+2]
	            if x == y:
	                continue
	            for t in 'abc':
	                if t != x and t != y:
	                    T = S[:i] + t+t + S[i+2:]
	                    if T not in se:
	                        q.append(T)
	                        se.add(T)
	    return len(se)
	
	LS = len(S)
	if LS < 6:
	    answer = solve_naive(S)
	    print(answer)
	    exit()
	
	# 適当な必要条件のもと全部作れる
	# mod 3不変量
	answer = pow(3,LS-1,MOD)
	# 同一値の連続が存在しないものを間引く
	if LS%3 == 0:
	    x,y = (3+MOD)//2,0
	    for _ in range(LS//3):
	        x,y = 4*x+4*y,2*x+6*y
	        x %= MOD
	        y %= MOD
	    if arr.sum()%3 == 0:
	        answer -= x
	    else:
	        answer -= y
	else:
	    answer -= pow(2,LS-1,MOD)
	# 初手に完成しているやつは使って良い
	if (arr[:-1] != arr[1:]).all():
	    answer += 1
	
	answer %= MOD
	print(answer)