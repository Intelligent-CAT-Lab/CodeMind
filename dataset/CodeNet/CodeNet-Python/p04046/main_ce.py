import math
H, W, A, B = map(int, "2 3 1 1".split())
MOD = 10 ** 9 + 7
factorial = [1]
inv_factorial = [1]
for i in range(1, H+W+1):
    factorial.append(factorial[-1] * i % MOD)
    inv_factorial.append(pow(factorial[-1], MOD-2, MOD))
def f(h, w):
    return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD
answer = 0
for i in range(B+1, W+1):
    answer += f(H-A, i) * f(A, W-i+1)
    answer %= MOD
print(int(answer))
