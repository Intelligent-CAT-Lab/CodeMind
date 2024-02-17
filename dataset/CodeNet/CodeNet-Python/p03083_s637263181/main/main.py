from math import factorial

B,W = list(map(int, input().split()))
mod = 10**9 + 7

def comb(n,r):
  if n >= r:
    numer = factorial(n) % mod
    denom_inv = pow(((factorial(r) % mod)* (factorial(n-r) % mod)), mod-2, mod)
    return (numer * denom_inv) % mod
  else:
    return 0

ans = [0] * (B + W + 1)
ans_change = [0] * (B + W + 1)
change = (comb(B-1,0) * pow(2, W, mod)) % mod
two_inv = pow(2, mod-2, mod)
for i in range(W+1):
  if i < W:
    if i > 0:
      change = (change * (B+i-1) * pow(i, mod-2, mod) * two_inv) % mod
    change2 = (change * (B-1) * pow(B+i-1, mod-2, mod)) % mod
    ans_change[1] = (ans_change[1] + change2) % mod if B+i-1 > 0 else ans_change[1] + change
    ans_change[B+i] = (ans_change[B+i] + change - change2) % mod if B+i-1 > 0 else ans_change[B+i]
    ans_change[B+i+1] = (ans_change[B+i+1] - change) % mod
  else:
    change = (comb(W-1, 0) * pow(2, B, mod)) % mod
    for j in range(B):
      if j > 0:
        change = (change * (W+j-1) * pow(j, mod-2, mod) * two_inv) % mod
      change2 = (change * j * pow(W+j-1, mod-2, mod)) % mod
      ans_change[1] = (ans_change[1] + change2) % mod if W+j-1 > 0 else ans_change[1]
      ans_change[W+j] = (ans_change[W+j] - change2) % mod if W+j-1 > 0 else ans_change[W+j]
      ans_change[W+j+1] = (ans_change[W+j+1] + change) % mod
for i in range(B+W+1):
  ans[i] = (ans[i-1] + ans_change[i]) % mod
x = pow(2, B+W, mod)
for y in ans[1:]:
  print((int((pow(x, mod-2, mod) * y) % mod)))