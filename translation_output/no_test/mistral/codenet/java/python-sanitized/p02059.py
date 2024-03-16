import sys

def get_bits(S):
    N = len(S)
    bits = [0] * (N + 64)
    for i in range(N):
        if S[i] == 'G':
            bits[i+1] = 1
        elif S[i] == '?':
            bits[i+1] = 1
    return bits

def count_bits(bits, pow3):
    ans = 0
    for i in range(1, N - 1):
        if bits[i] == 1 or bits[N - 1 - i] == 1:
            continue
        q = 0
        if bits[i] == 1:
            q = 1
        elif bits[N - 1 - i] == 1:
            q = N - 1
        for j in range(1, min(N - 1 - i, i) + 1):
            ans += (bits[j] & bits[N - 1 - i]) * pow3[q]
            if q >= 1:
                ans += (bits[j] & bits[N - i]) * pow3[q - 1]
                ans += (bits[N - 1 - i] & bits[N - i]) * pow3[q - 1]
            if q >= 2:
                ans += (bits[N - 1 - i] & bits[N - 1 - i]) * pow3[q -