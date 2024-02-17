import math

N = int(input())

factors = []
d = math.floor(N**(1/2))
for i in range(1,d+1):
	if N%i==0:
		factors.append(i)
		factors.append(N//i)

ans = 0
for f in factors:
	if f == 1:
		continue
	s,t = divmod(N,f-1)
	if s == t:
		ans += f-1

print(ans)