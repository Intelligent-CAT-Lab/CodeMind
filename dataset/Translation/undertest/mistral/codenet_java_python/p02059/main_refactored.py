class main:
    import sys
    
    def count_bits(n):
        count = 0
        while n != 0:
            count += bin(n)[2:]
            n >>= 1
        return count
    
    def main():
        S = sys.stdin.readline().strip()
        N = len(S)
        pow3 = [1] * (N + 1)
        for i in range(1, N + 1):
            pow3[i] = pow3[i - 1] * 3 % 1000000007
    
        bsf1 = Bits(N + 64)
        bsf2 = Bits(N + 64)
        bsb1 = Bits(N + 64)
        bsb2 = Bits(N + 64)
        Q = 0
        for i in range(N):
            if S[i] == 'G':
                bsf