class Bits:
    def __init__(self, size):
        self.bits = [0] * ((size + 63) // 64)
        
    def copy(self, buf, from_pos):
        start = from_pos >> 6
        rem = from_pos & 63
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
    
    def get(self, pos):
        return (self.bits[pos >> 6] >> (pos & 63)) & 1
    
    def set(self, pos):
        self.bits[pos >> 6] |= 1 << (pos & 63)
    
    def __str__(self):
        return ','.join(format(x, 'x') for x in self.bits)
        

def main(S):
    MOD = 998244353
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