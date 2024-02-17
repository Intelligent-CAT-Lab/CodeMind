class main:
	S = eval(input())
	l = len(S)
	mod = 10**9+7
	dp = [[0]*13 for _ in range(l+1)]
	dp[0][0] = 1
	
	for i,s in enumerate(S):
	    for j in range(13):
	        if(s=="?"):
	            for k in range(10):
	                dp[i+1][((j*10)+k)%13] += dp[i][j]
	                dp[i+1][((j*10)+k)%13]%=mod
	        else:
	            dp[i+1][((j*10)+int(s))%13] += dp[i][j]
	            dp[i+1][((j*10)+int(s))%13]%=mod
	print((dp[l][5]))