class main:
    n = int(input())
    k = int(input())
    l = int(input())
    r = int(input())
    sAll = int(input())
    sk = int(input())
    
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
    
    print(" ".join(map(str, ans)))