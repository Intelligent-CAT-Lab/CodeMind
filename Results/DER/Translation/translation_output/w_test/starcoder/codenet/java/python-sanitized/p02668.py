MOD = 1000000007

def eleva(a, e):
	if e == 0: return 1
	ret = eleva(a, e / 2)
	ret = (ret * ret) % MOD
	if e % 2 == 1:
		ret = (ret * a) % MOD
	return ret

def inv(a):
	return eleva(a, MOD - 2)

def calc(rem, bits):
	if bits == 1: return pot2[rem]
	ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
	ret += (rem + 1) * calc(rem, bits - 1)
	ret %= MOD
	return ret

def calc2(rem, bits):
	if rem == 0: return 0
	ret = calc2(rem - 1, bits)
	tmp = (rem * calc(rem, bits)) % MOD
	tmp = (tmp * invPot2[rem + 1]) % MOD
	ret = (ret + tmp) % MOD
	return ret

N, M = map(int, raw_input().split())

pot2 = [1]
invPot2 = [inv(2)]
for i in range(1, M + 1):
	pot2.append((pot2[-1] * 2) % MOD)
	invPot2.append((invPot2[-1] * 2) % MOD)

table = [[-1 for i in range(N + 1)] for j in range(M + 1)]
table2 = [[-1 for i in range(N + 1)] for j in range(M + 1)]

print calc(M, N)