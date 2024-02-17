class main:
	range = xrange
	S = int(input())
	MOD = 10**9+7
	ans = 0
	
	# l has <= 7 digits
	r = 1
	tot = 1
	for l in range(1, 10000000):
	    while tot < S:
	        r+= 1
	        tot+= len(str(r))
	    if tot == S: ans+= 1
	    tot-= len(str(l))
	
	# l has > 7 digits
	for cnt in range(1, S+1):
	    d, m = divmod(S, cnt)
	    if d <= 7: break
	    if m: ans+= 1
	    else: ans+= pow(10, d, MOD) - pow(10, d-1, MOD) - cnt + 1
	    ans%= MOD
	print(ans % MOD)