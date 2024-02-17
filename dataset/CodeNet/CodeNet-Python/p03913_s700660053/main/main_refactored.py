class main:
	
	"""
	
	https://atcoder.jp/contests/cf16-final/tasks/codefestival_2016_final_e
	
	部分点を考えてみる
	dp[i] = i枚を焼くのにかかる最小の時間　としてみる
	初期値は, dp[i] = i
	dp[i] <- dp[j] + A*j + (i+j-1)//j
	これだと部分点も取れない
	
	Aって結構でかそうだよな…
	dp[i+1] <= dp[i] + 1
	である。つまり、差は0か1
	これは、少なくとも1秒待てば焼けることから証明できる
	
	推移先は、 dp[j] + A*j 以上なのは確定
	
	
	そして掛け算であるということは順番を入れ替えることができる
	(((1×4秒)×5秒)×3秒)=60枚(編集済)
	順番を入れ替えても
	(((1×3秒)×4秒)×5秒)=60枚
	by werug
	
	積がx以上となる数列aで、
	a1+a2+a3+…+an + A×(n-1)
	が最小となるものを見つけなさい
	n <= 40　くらい
	
	n個の数列で、積がX以上になるうち
	和が最小のものを求めなさい → これを 1<=n<=40 に対して計算すればいい
	
	和を最小化するには、できるだけ同じ数字で分散させるのが最適…？(編集済)
	12の時、 1x12 , 2x6 , 3x4 だと 3x4が一番輪が小さい
	整数以外も可能なら, X^(-n) づつが最適
	整数だとceil (X^(-n)) と、floor(X^(-n)) を一定個数づつ混ぜるのが最適のはず(編集済)
	→全探索できる
	
	"""
	
	from sys import stdin
	N,A = list(map(int,stdin.readline().split()))
	
	ans = N
	for s in range(1,45): #sは数列の長さ
	
	    if 2**s >= N:
	        ans = min( ans , 2*s + A*(s-1) )
	        continue
	
	    nm = int(N**(1/s))
	    #print (s,nm)
	    for t in range(s+1):
	        if pow(nm,t) * pow(nm+1,s-t) >= N:
	            ans = min(ans , nm*t+(nm+1)*(s-t) + A*(s-1) )
	
	print (ans)
	
	#実験
	"""
	dp = [i for i in range(N+1)]
	
	for i in range(N+1):
	    for j in range(1,i):
	        dp[i] = min(dp[i] , dp[j] + A + (i+j-1)//j )
	
	print (dp)
	"""
