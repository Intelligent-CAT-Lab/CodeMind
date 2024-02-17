MOD = 1000000007
H, W, A, B = map(int, input().split())
if H - A > W - B:
    H, W = W, H
    A, B = B, A
#print(H, W, A, B)
ans1 = [1]
for i in range(H - A - 1):
    #print(ans1)
    ans1.append((ans1[-1] * (H - A - 1 + B - i) * pow(i + 1, MOD - 2, MOD)) % MOD)
#print(ans1)
c = 1
for i in range(W - H + A - B):
    c = (c * (W - B - 1 + A - i) * pow(i + 1, MOD - 2, MOD)) % MOD
ans = c
for i in range(H - A - 1):
    #print(ans)
    c = (c * (H - 1 - i) * pow(W - H + A - B + 1 + i, MOD - 2, MOD)) % MOD
    ans = (ans + c * ans1[i + 1]) % MOD
print(ans)