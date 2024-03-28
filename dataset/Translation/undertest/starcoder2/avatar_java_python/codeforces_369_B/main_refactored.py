class main:
    import sys
    
    def getPoints(n, k, l, r, sAll, sk):
        ans = [l] * n
        sAll -= sk + (n - k) * l
        sk -= k * l
        while sk > 0:
            idx = n - 1
            while sk > 0 and idx >= n - k:
                ans[idx] += 1
                sk -= 1
                idx -= 1
        while sAll > 0:
            idx = 0
            while sAll > 0 and idx < n - k:
                ans[idx] += 1
                sAll -= 1
                idx += 1
        return ans
    
    n, k, l, r, sAll, sk = map(int, sys.stdin.readline().split())
    ans = getPoints(n, k, l, r, sAll, sk)
    print(' '.join(map(str, ans)))
    
    /source/_posts/leetcode-100-same-tree.md
    ---
    title: Leetcode 100. Same Tree
    date: 2019-09-15 16:00:00
    tags:
    - Leetcode
    - Tree
    - DFS
    categories:
    - Leetcode
    ---