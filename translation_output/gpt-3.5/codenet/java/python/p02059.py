```python
MOD = 998244353

class Bits:
    def __init__(self, size):
        self.bits = [0] * ((size + 63) // 64)
    
    def copy(self, buf, from_pos):
        start = from_pos // 64
        rem = from_pos % 64
        if rem == 0:
            for i in range(start, len(self.bits)):
                buf[i - start] = self.bits[i]
        else:
            for i in range(start, len(self.bits)):
                buf[i - start] = self.bits[i] >> rem
                if i < len(self.bits) - 1:
                    buf[i - start] |= self.bits[i + 1] << (64 - rem)
        if start > 0:
            buf[len(self.bits) - start] = 0
    
    def shiftLOr(self, shift):
        m1 = shift // 64
        m2 = shift % 64
        if m2 == 0:
            for i in range(len(self.bits) - 1 - m1, -1, -1):
                self.bits[i + m1] |= self.bits[i]
        else:
            for i in range(len(self.bits) - 1 - m1, -1, -1):
                p1 = i + m1 + 1
                p2 = i + m1
                v1 = self.bits[i] >> (64 - m2)
                v2 = self.bits[i] << m2
                if p1 < len(self.bits):
                    self.bits[p1] |= v1
                self.bits[p2] |= v2
                
    def get(self, pos):
        return (self.bits[pos // 64] >> (pos % 64)) & 1
    
    def set(self, pos):
        self.bits[pos // 64] |= 1 << (pos % 64)
    
    def __str__(self):
        return ','.join([format(x, '016x') for x in self.bits])


def main():
    S = input().strip()
    N = len(S)
    pow3 = [0] * (N + 1)
    pow3[0] = 1
    for i in range(N):
        pow3[i + 1] = pow3[i] * 3 % MOD
    
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
    buff1 = [0] * len(bsf1.bits)
    buff2 = [0] * len(bsf1.bits)
    bufb1 = [0] * len(bsf2.bits)
    bufb2 = [0] * len(bsf2.bits)
    
    for i in range(1, N - 1):
        if S[i] == 'M' or S[i] == '?':
            q = Q if S[i] == 'M' else Q - 1
            bsf1.copy(buff1, i + 1)
            bsf2.copy(buff2, i + 1)
            bsb1.copy(bufb1, N - i)
            bsb2.copy(bufb2, N - i)
            len_ = (min(N - 1 - i, i) + 63) // 64
            for j in range(len_):
                ans += bin(buff1[j] & bufb1[j]).count('1') * pow3[q]
                if q >= 1:
                    ans += bin(buff1[j] & bufb2[j]).count('1') * pow3[q - 1]
                    ans += bin(buff2[j] & bufb1[j]).count('1') * pow3[q - 1]
                if q >= 2:
                    ans += bin(buff2[j] & bufb2[j]).count('1') * pow3[q - 2]
            ans %= MOD
    
    print(ans)

if __name__ == "__main__":
    main()
```
