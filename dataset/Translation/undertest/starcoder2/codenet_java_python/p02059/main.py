MOD = 998244353

def main():
    S = input()
    N = len(S)
    pow3 = [1] * (N + 1)
    for i in range(N):
        pow3[i + 1] = pow3[i] * 3 % MOD
    bsf1 = Bits(N + 64)
    bsf2 = Bits(N + 64)
    bsb1 = Bits(N + 64)
    bsb2 = Bits(N + 64)
    Q = 0
    for i in range(N):
        if S[i] == 'G':
            bsf