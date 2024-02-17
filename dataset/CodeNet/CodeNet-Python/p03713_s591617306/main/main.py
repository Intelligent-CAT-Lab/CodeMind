def pat1(H,W):
    if H % 3 == 0:
        return 0
    else:
        return W

def pat2(H,W):
    if W % 3 == 0:
        return 0
    else:
        return H

def pat3(H,W):
    h1 = H // 2
    h2 = H - h1
    ans = 10**15 
    for w in range(1,W//2+1):
        s1 = h1 * (W-w)
        s2 = h2 * (W-w)
        s3 = H*w
        min1 = min(s1,s2,s3)
        max1 = max(s1,s2,s3)
        ans = min(ans,max1-min1)
    return ans

def pat4(H,W):
    w1 = W // 2
    w2 = W - w1
    ans = 10**15
    for h in range(1,H//2+1):
        s1 = w1*(H-h)
        s2 = w2*(H-h)
        s3 = W*h
        min1 = min(s1,s2,s3)
        max1 = max(s1,s2,s3)
        ans = min(ans,max1-min1)
    return ans

H,W = list(map(int,input().split()))
ans = 10**15
ans = min(ans,pat1(H,W))
ans = min(ans,pat2(H,W))
ans = min(ans,pat3(H,W))
ans = min(ans,pat4(H,W))

print(ans)
