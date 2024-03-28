class P00369:
    def val(self, ch):
        return int(ch)

    def sub(self, maxs, mins):
        for i in range(len(maxs)):
            if maxs[i] != mins[i]:
                if i == len(maxs)-1:
                    return self.val(maxs[i]) - self.val(mins[i])
                if i == len(maxs)-2:
                    return (10*self.val(maxs[i])+self.val(maxs[i+1])) - (10*self.val(mins[i])+self.val(mins[i+1]))
                return 10
        return 0

    def check_equal(self, S):
        ans = 8
        for k in range(1, len(S)):
            if len(S) % k != 0:
                continue
            mins = S[:k]
            maxs = S[:k]
            for s in range(0, len(S), k):
                tmp = S[s:s+k]
                if tmp > maxs:
                    maxs = tmp
                if tmp < mins:
                    mins = tmp
            ans = min(ans, self.sub(maxs, mins))
        return ans

    def check12(self, S):
        maxv = 0
        minv = 10
        p = 0
        while p < len(S):
            v = self.val(S[p])
            if S[p] == '1' and p+1 < len(S):
                v = 10 + self.val(S[p+1])
                p += 1
            maxv = max(maxv, v)
            minv = min(minv, v)
            p += 1
        return maxv - minv

    def solve(self):
        S = input()
        print(min(self.check_equal(S), self.check12(S)))

if __name__ == "__main__":
    P00369().solve()