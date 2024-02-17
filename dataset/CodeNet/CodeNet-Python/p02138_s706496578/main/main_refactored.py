class main:
	N,M = list(map(int,input().split()))
	
	ah = N*2
	bh = M*2
	ans1 = 0
	while True:
	    ap = min(N,ah)
	    bh -= ap
	    if bh <= 0:
	        break
	    ans1 += 1
	    #print('ans1,ah,bh,ap',ans1,ah,bh,ap)
	    bp = (bh+1)//2
	    ah -= bp
	    if ah <= 0:
	        break
	    ans1 += 1
	    #print('ans1,ah,bh,bp',ans1,ah,bh,bp)
	
	#print(ans1)
	
	ah = N*2
	bh = M*2
	ans2 = 0
	while True:
	    ap = (ah+1)//2
	    bh -= ap
	    if bh <= 0:
	        break
	    ans2 += 1
	    bp = min(M,bh)
	    ah -= bp
	    if ah <= 0:
	        break
	    ans2 += 1
	
	#print(ans2)
	
	print((min(ans1,ans2)))
	
