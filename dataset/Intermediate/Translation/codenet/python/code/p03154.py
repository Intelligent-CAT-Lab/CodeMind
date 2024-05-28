MOD = 10**9 + 7
list_size = 20000001

f_list = [1] * list_size
f_r_list = [1] * list_size

for i in range(list_size-1):
	f_list[i+1] = (f_list[i] * (i+1)) % MOD

f_r_list[-1] = pow(f_list[-1], MOD - 2, MOD)

for i in range(list_size-2, -1, -1):
	f_r_list[i] = (f_r_list[i+1] * (i+1)) % MOD

h, w, k = map(int, input().split())
ans = k * f_list[h+w] * f_r_list[h+w-k]
ans += (h+w) * k * (k+1) * f_list[h+w-1] * f_r_list[2] * f_r_list[h+w-k]
ans %= MOD
ans += h * w * f_list[h+w-2] * (k-1) * k * (k+1) * pow(3, MOD-2, MOD) * f_r_list[h+w-k]
ans %= MOD
print(ans)