p = 10**9+7; M=10**5;
F = [1]; FI=[0]*(M+1)
for i in xrange(1,M*2+1):F+=[i*F[i-1]%p]
FI[M]=pow(F[M],p-2,p)
for i in xrange(M,0,-1):FI[i-1]=i*FI[i]%p
H,W,A,B = map(int,raw_input().split())
hx,hy = B+1,H-A
ans = 0
while hx <= W and hy > 0:
	tmp = F[hx+hy-2]*FI[hx-1]*FI[hy-1]%p * F[W-hx+H-hy]*FI[W-hx]*FI[H-hy]%p
	ans = (ans + tmp) % p
	hx += 1; hy -= 1
print ans