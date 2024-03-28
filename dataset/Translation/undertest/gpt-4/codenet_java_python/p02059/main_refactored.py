class main:
    MOD = 998244353
    
    def bit_count(x):
        return bin(x).count('1')
    
    def copy(bits, buf, from_idx):
        start = from_idx >> 6
        rem = from_idx & 63
        if rem == 0:
            for i in range(start, len(bits)):
                buf[i - start] = bits[i]
        else:
            for i in range(start, len(bits)):
                buf[i - start] = bits[i] >> rem
                if i < len(bits) - 1:
                    buf[i - start] |= bits[i + 1] << (64 - rem)
        if start > 0:
            buf[len(bits) - start] = 0
    
    def main():
        S = input()
        N = len(S)
        pow3 = [1] * (N + 1)
        for i in range(N):
            pow3[i + 1] = pow3[i] * 3 % MOD
    
        bsf1 = [0] * ((N + 63) // 64)
        bsf2 = [0] * ((N + 63) // 64)
        bsb1 = [0] * ((N + 63) // 64)
        bsb2 = [0] * ((N + 63) // 64)
        Q = 0
        for i in range(N):
            if S[i] == 'G':
                bsf1[i >> 6] |= 1 << (i & 63)
            elif S[i] == '?':
                bsf2[i >> 6] |= 1 << (i & 63)
                Q += 1
            if S[N - 1 - i] == 'U':
                bsb1[i >> 6] |= 1 << (i & 63)
            elif S[N - 1 - i] == '?':
                bsb2[i >> 6] |= 1 << (i & 63)
        
        ans = 0
        buff1 = [0] * len(bsf1)
        buff2 = [0] * len(bsf1)
        bufb1 = [0] * len(bsf2)
        bufb2 = [0] * len(bsf2)
        for i in range(1, N - 1):
            if S[i] == 'M' or S[i] == '?':
                q = Q if S[i] == 'M' else Q - 1
                copy(bsf1, buff1, i + 1)
                copy(bsf2, buff2, i + 1)
                copy(bsb1, bufb1, N - i)
                copy(bsb2, bufb2, N - i)
                len_ = (min(N - 1 - i, i) + 63) // 64
                for j in range(len_):
                    count1 = bit_count(buff1[j] & bufb1[j])
                    ans += count1 * pow3[q]
                    if q >= 1:
                        count2 = bit_count(buff1[j] & bufb2[j])
                        count3 = bit_count(buff2[j] & bufb1[j])
                        ans += (count2 + count3) * pow3[q - 1]
                    if q >= 2:
                        count4 = bit_count(buff2[j] & bufb2[j])
                        ans += count4 * pow3[q - 2]
                    ans %= MOD
    
        print(ans)
    
    if __name__ == "__main__":
        main()