class main:
    def val(ch):
        return int(ch)
    
    def sub(maxs, mins):
        for i in range(len(maxs)):
            if maxs[i] != mins[i]:
                if i == len(maxs) - 1:
                    return val(maxs[i]) - val(mins[i])
                if i == len(maxs) - 2:
                    return (10 * val(maxs[i]) + val(maxs[i+1])) - (10 * val(mins[i]) + val(mins[i+1]))
                return 10
        return 0
    
    def checkEqual(S):
        ans = 8
        for k in range(1, len(S)):
            if len(S) % k != 0:
                continue
            mins = maxs = S[:k]
            for s in range(0, len(S), k):
                tmp = S[s:s+k]
                if tmp > maxs:
                    maxs = tmp
                if tmp < mins:
                    mins = tmp
            ans = min(ans, sub(maxs, mins))
        return ans
    
    def check12(S):
        maxv = 0
        minv = 10
        p = 0
        while p < len(S):
            v = val(S[p])
            if S[p] == '1' and p+1 < len(S):
                v = 10 + val(S[p+1])
                p += 1
            maxv = max(maxv, v)
            minv = min(minv, v)
            p += 1
        return maxv - minv
    
    def solve(S):
        return min(checkEqual(S), check12(S))
    
    # Test input
    S = "11121314"
    # Expected output: 3
    print(solve(S))