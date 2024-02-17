from sys import exit
MOD = 998244353
s, K = input().split()
K = min(int(K), s.count("1"))
if K == 0:
	print((1))
	exit()

a = []
cnt = 0
for i in range(len(s)):
	if s[i] == "0":
		a.append(cnt)
		cnt = 0
	else:
		cnt += 1
a.append(cnt)
a.reverse()
#print(a)
n = len(a)
dp = [[[0 for _ in range(K+1)] for _ in range(K+1)] for _ in range(n+1)]
col = [[0 for _ in range(K+1)] for _ in range(K+1)]
dia = [[0 for _ in range(K+1)] for _ in range(K+1)]
dp[0][0][0] = 1
col[0][0] = 1
for j in range(K+1):
	dia[j][j] = 1

#減らす
def COL(j, k):
	if k == 0:
		return col[j][j]
	else:
		return col[j][j] - col[j][k-1]

#増やす
def DIA(i, j, k):
	if k == 0:
		return 0
	elif k > a[i-1]:
		return dia[j-1][k-1] - dia[j-a[i-1]-1][k-a[i-1]-1]
	else:
		return dia[j-1][k-1]

for i in range(1, n+1):
	for j in range(K+1):
		for k in range(j+1):
			dp[i][j][k] += COL(j, k)
			dp[i][j][k] += DIA(i, j, k)
			dp[i][j][k] %= MOD
	for j in range(K+1):
		col[j][0] = dp[i][j][0]
		dia[j][0] = dp[i][j][0]
		for k in range(1, j+1):
			col[j][k] = (col[j][k-1] + dp[i][j][k]) % MOD
			dia[j][k] = (dia[j-1][k-1] + dp[i][j][k]) % MOD

ans = 0
for j in range(K+1):
	ans += dp[n][j][0]
	ans %= MOD
print(ans)