import sys

MOD = 998244353

def main():
    S = sys.stdin.readline().strip()
    N = len(S)
    pow3 = [1]
    for _ in range(N):
        pow3.append(pow3[-1] * 3 % MOD)
    bsf1 = [0] * (N + 64)
    bsf2 = [0] * (N + 64)
    bsb1 = [0] * (N + 64)
    bsb2 = [0] * (N + 64)
    Q = 0
    for i in range(N):
        if S[i] == 'G':
            bsf1[i] = 1
        elif S[i] == '?':
            bsf2[i] = 1
            Q += 1
        if S[N - 1 - i] == 'U':
            bsb1[i] = 1
        elif S[N - 1 - i] == '?':
            bsb2[i] = 1
    ans = 0
    buff1 = [0] * (N + 64)
    buff2 = [0] * (N + 64)
    bufb1 = [0] * (N + 64)
    bufb2 = [0] * (N + 64)
    for i in range(1, N - 1):
        if S[i] == 'M' or S[i] == '?':
            q = Q if S[i] == 'M' else Q - 1
            for j in range(i + 1, N + 64):
                buff1[j - i - 1] = bsf1[j]
                buff2[j - i - 1] = bsf2[j]
                bufb1[j - i - 1] = bsb1[j]
                bufb2[j - i - 1] = bsb2[j]
            for j in range(min(N - 1 - i, i) + 63 // 64):
                ans += bin(buff1[j] & bu