r,g,b,n = list(map(int, input().split()))
mem = {}
def dfs(i, ais, tot):
	if tot < 0:
		return 0
	if i == len(ais):
		return 1 if tot == 0 else 0
	if i == len(ais) -1:
		return 1 if (tot >= 0 and tot % ais[i] == 0) else 0
	key = (i,tot)
	if key in mem:
		return mem[(i,tot)]
	nt = tot
	cumul = 0
	cumul += dfs(i + 1, ais, tot)
	while(tot>0):
		tot -= ais[i]
		cumul += dfs(i+1, ais, tot)
	mem[key] = cumul
	return cumul


print(dfs(0,[r,g,b],n))
