class main:
	N, H, D = list(map(int,input().split()))
	MOD = 10**9 + 7
	 
	fact = [1]
	fact_cum = [0]
	for i in range(1,N+1):
	  fact.append((fact[-1]*i)%MOD)
	  fact_cum.append((fact_cum[-1] + fact[-1])%MOD)
	 
	ap = [0] * (H+1)
	ap_cum = [0] * (H+1)
	ap[0] = 1
	ap_cum[0] = 1
	 
	for n in range(1,H+1):
	  x = ap_cum[n-1]
	  if n > D:
	    x -=ap_cum[n-D-1]
	  x *= fact_cum[N]
	  x %= MOD
	  ap[n] = x
	  ap_cum[n] = (ap_cum[n-1] + x)%MOD
	 
	 
	ans = ap[H]
	ans *= fact[N]
	ans %= MOD
	ans *= pow(fact_cum[N],MOD-2,MOD)
	ans %= MOD
	 
	print(ans)