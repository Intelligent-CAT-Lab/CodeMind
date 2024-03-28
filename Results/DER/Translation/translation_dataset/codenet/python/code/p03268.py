import sys
input = sys.stdin.readline

n, k = [int(x) for x in input().split()]

n_k = n // k
n_mod_k = n % k

def mod_k(x):
    res = n_k
    if x != 0 and x <= n_mod_k:
        res += 1
    elif x == 0 and n_mod_k == k:
        res += 1
    return res

ans = 0

for i in range(k):
    a_mod = i
    b_mod = -i % k
    c_mod = -i % k
    if (b_mod +c_mod) % k == 0:
        ans += mod_k(a_mod) * mod_k(b_mod) * mod_k(c_mod)

print(ans)