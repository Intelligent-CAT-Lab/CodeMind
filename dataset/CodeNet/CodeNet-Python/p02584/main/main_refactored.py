class main:
	X,K,D = list(map(int,input().split()))
	# 原点に近い位置までの移動回数を求める
	count = abs(X) // D
	ans = 0
	# Kの方が小さければ可能な限り原点に近い位置を求める
	if count>K:
	    ans = abs(X) - D * K
	else:
		# 残りの移動回数が偶数
	    if (K-count)%2==0:
	        ans = abs(X) % D
	    # 残りの移動回数が奇数
	    else:
	        ans = abs(abs(X) % D - D)
	print(ans)
