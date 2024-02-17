mod = 1000000007
eps = 10**-9
def main():
    import sys
    from itertools import accumulate
    input = sys.stdin.readline
    # O(NlogN)
    # return suffix array and lcp array
    # 0th index of SA is |S|
    def SuffixArray(S):
        S = S + "$"
        N = len(S)
        LV = N.bit_length()
        # 0th sort
        P = []
        C = [0] * N
        cnt = [[] for _ in range(256)]
        for i, s in enumerate(S):
            cnt[ord(s)].append(i)
        cnt_c = 0
        for i_list in cnt:
            for i in i_list:
                P.append(i)
                C[i] = cnt_c
            if i_list:
                cnt_c += 1
        # doubling
        for k in range(LV):
            C_new = [0] * N
            cnt = [0] * N
            k2 = 1 << k
            for i in range(N):
                p = P[i] - k2
                if p < 0:
                    p += N
                cnt[C[p]] += 1
                P[i] = p
            cnt = list(accumulate(cnt))
            P_new = [0] * N
            for i in range(N-1, -1, -1):
                p = P[i]
                c = C[p]
                P_new[cnt[c] - 1] = p
                cnt[c] -= 1
            cnt_c = -1
            prev = None
            for p in P_new:
                p_ = p + k2
                if p_ >= N:
                    p_ -= N
                new = C[p] * N + C[p_]
                if new != prev:
                    cnt_c += 1
                    prev = new
                C_new[p] = cnt_c
            C = C_new
            P = P_new
        # lcp
        rank = [0] * N
        for i in range(N):
            rank[P[i]] = i
        LCP = [0] * (N - 1)
        h = 0
        for i in range(N - 1):
            j = P[rank[i] - 1]
            if h > 0:
                h -= 1
            while i + h < N and j + h < N:
                if S[i + h] == S[j + h]:
                    h += 1
                else:
                    break
            LCP[rank[i] - 1] = h
        return P, LCP
    S = "abcbcba".rstrip('\n')
    N = len(S)
    SA, LCP = SuffixArray(S)
    print(N * (N+1) // 2 - sum(LCP))
if __name__ == '__main__':
    main()
