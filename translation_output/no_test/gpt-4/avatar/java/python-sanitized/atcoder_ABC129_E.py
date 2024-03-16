MOD = 1000000007

s = input()
n = len(s)
a = [False] * 100000

for i in range(n):
    a[i] = s[i] == '1'

an = 0
pow2 = [0] * 100005
pow3 = [0] * 100005
cp2 = 1
cp3 = 1

for i in range(100005):
    pow2[i] = cp2
    pow3[i] = cp3
    cp2 = (cp2 * 2) % MOD
    cp3 = (cp3 * 3) % MOD

ones = 0

for i in range(n):
    if a[i]:
        digle = n - i - 1
        cur = (pow3[digle] * pow2[ones]) % MOD
        an = (an + cur) % MOD
        ones += 1

cur = pow2[ones] % MOD
an = (an + cur) % MOD

print(an)