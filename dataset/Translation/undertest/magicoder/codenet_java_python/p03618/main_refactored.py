class main:
    import sys
    
    def solve(s):
        N = len(s)
        cnt = [0]*26
        for c in s:
            cnt[ord(c)-ord('a')] += 1
    
        ans = N*(N+1)//2 + 1
        for i in range(26):
            if cnt[i] > 0:
                ans -= cnt[i]*(cnt[i]+1)//2
    
        return ans
    
    if __name__ == "__main__":
        s = sys.stdin.readline().strip()
        print(solve(s))