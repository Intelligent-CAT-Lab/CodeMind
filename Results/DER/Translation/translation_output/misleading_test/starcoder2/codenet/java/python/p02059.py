

```python
MOD = 998244353

def main():
    S = input()
    N = len(S)
    pow3 = [1]
    for i in range(N):
        pow3.append(pow3[-1] * 3 % MOD)
    bsf1 = Bits(N + 64)
    bsf2 = Bits(N + 64)
    bsb1 = Bits(N + 64)
    bsb2 = Bits(N + 64)
    Q = 0
    for i in range(N):
        if S[i] == 'G':
            bsf1.set(i)
        elif S[i] == '?':
            bsf2.set(i)
            Q += 1
        if S[N - 1 - i] == 'U':
            bsb1.set(i)
        elif S[N - 1 - i] == '?':
            bsb2.set(i)
    ans = 0
    buff1 = [0] * bsf1.bits.length
    buff2 = [0] * bsf1.bits.length
    bufb1 = [0] * bsf2.bits.length
    bufb2 = [0] * bsf2.bits.length
    for i in range(1, N - 1):
        if S[i] == 'M' or S[i] == '?':
            q = Q if S[i] == 'M' else Q - 1
            bsf1.copy(buff1, i + 1)
            bsf2.copy(buff2, i + 1)
            bsb1.copy(bufb1, N - i)
            bsb2.copy(bufb2, N - i)
            len = (min(N - 1 - i, i) + 63) // 64
            for j in range(len):
                ans += Long.bitCount(buff1[j] & bufb1[j]) * pow3[q]
                if q >= 1:
                    ans += Long.bitCount(buff1[j] & bufb2[j]) * pow3[q - 1]
                    ans += Long.bitCount(buff2[j] & bufb1[j]) * pow3[q - 1]
                if q >= 2:
                    ans += Long.bitCount(buff2[j] & bufb2[j]) * pow3[q - 2]
            ans %= MOD
    print(ans)

class Bits:
    def __init__(self, size):
        self.bits = [(size + 63) // 64]

    def copy(self, buf, from):
        start = from >> 
