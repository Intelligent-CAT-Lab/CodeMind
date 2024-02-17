class main:
	import sys
	read = sys.stdin.buffer.read
	readline = sys.stdin.buffer.readline
	readlines = sys.stdin.buffer.readlines
	
	W = list(map(int,read().rstrip()))
	
	N = len(W)
	
	def Z_Algorithm(S):
	    # 共通接頭辞の長さを返す
	    N=len(S)
	    arr = [0]*N
	    arr[0] = N
	    i,j = 1,0
	    while i<N:
	        while i+j<N and S[j]==S[i+j]:
	            j += 1
	        arr[i]=j
	        if not j:
	            i += 1
	            continue
	        k = 1
	        while i+k<N and k+arr[k]<j:
	            arr[i+k] = arr[k]
	            k += 1
	        i += k; j -= k
	    return arr
	
	def find_good_substr(W):
	    Z = Z_Algorithm(W)
	    is_good = [True]*(N+1) # 長さをインデックス
	    for n in range(1,N//2+1):
	        # n文字での周期をもってくる
	        if not is_good[n]:
	            continue
	        for i in range(n+n,Z[n]+n+1,n):
	            is_good[i] = False
	    return is_good
	
	def solve():
	    G1 = find_good_substr(W)
	    G2 = find_good_substr(W[::-1])[::-1]
	    if G1[-1]:
	        # 自分自身がoptimal
	        return 1,1
	    if len(set(W)) == 1:
	        return N,1
	    # 2個にできるはず
	    x = sum(x and y for x,y in zip(G1[1:-1],G2[1:-1]))
	    return 2,x
	
	x,y = solve()
	print(x)
	print(y)