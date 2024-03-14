import java.util.*;

class p00369:
    def val(self, ch):
        return ord(ch) - ord('0')

    def sub(self, maxs, mins):
        for i in range(maxs.length()):
            if maxs.charAt(i)!= mins.charAt(i):
                if i == maxs.length()-1:
                    return self.val(maxs.charAt(i)) - self.val(mins.charAt(i))
                if i == maxs.length()-2:
                    return (10*self.val(maxs.charAt(i))+self.val(maxs.charAt(i+1))) - (10*self.val(mins.charAt(i))+self.val(mins.charAt(i+1)))
                return 10
        return 0

    def checkEqual(self, S):
        mins, maxs = "", ""
        ans = 8
        for k in range(1, S.length()):
            if S.length() % k!= 0:
                continue
            mins, maxs = S[:k], S[:k]
            for s in range(0, S.length(), k):
                tmp = S[s:s+k]
                if tmp > maxs:
                    maxs = tmp
                if tmp < mins:
                    mins = tmp
            ans = min(ans, self.sub(maxs, mins))
        return ans

    def check12(self, S):
        maxv, minv = 0, 10
        for p in range(S.length()):
            v = self.val(S.charAt(p))
            if S.charAt(p) == '1' and p+1 < S.length():
                v = 10 + self.val(S.charAt(p+1))
                p += 1
            maxv = max(maxv, v)
            minv = min(minv, v)
        return maxv - minv

    def solve(self):
        S = input()
        print(min(self.checkEqual(S), self.check12(S)))

p00369().solve()