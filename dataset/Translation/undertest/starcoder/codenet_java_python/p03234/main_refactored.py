class main:
    import sys
    
    mod = 1000000007
    
    def waysToPair(x):
    	if x%2==1: return 0
    	if x==0: return 1
    	return waysToPair(x-2)*(x-1)%mod
    
    def paired(x,y):
    	return f[y]-f[x-1]
    
    def inside(a,x,y):
    	return (x<=a and a<=y)
    
    def caldp(x,y):
    	if dp[x][y]!=-1: return dp[x][y]
    	
    	notPairedinXY = (y-x+1)-paired(x,y)
    	
    	for i in range(1,k+1):
    		p1 = inside(a[i],x,y)
    		p2 = inside(b[i],x,y)
    		if p1!=p2:
    			dp[x][y]=0
    			return dp[x][y]
    	dp[x][y]=waysToPair(notPairedinXY)
    	
    	for z in range(x+1,y):
    		notPairedinZY = (y-(z+1)+1)-paired(z+1,y)
    		dp[x][y]=(dp[x][y]-caldp(x,z)*waysToPair(notPairedinZY)+mod*mod)%mod
    	
    	return dp[x][y]