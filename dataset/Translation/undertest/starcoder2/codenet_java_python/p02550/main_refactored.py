class main:
    import sys
    
    N, X, M = map(int, sys.stdin.readline().split())
    
    used = set()
    A = []
    A.append(X)
    used.add(X)
    
    K = 0
    L = 0
    ans = 0
    breakflag = False
    
    for i in range(M-1):
        prev = A[i]
        now = (prev*prev) % M
        if now == 0:
            for j in range(i+1):
                ans += A[j]
            breakflag = True
            break
        elif now in used:
            L = i+1
            for j in range(i+1):
                if A[j] == now:
                    K = j
                    break
            sub = 0
            for j in range(K, L):
                sub += A[j]
            m = (N-K) % (L-K)
            left = 0
            for j in range(m):
                left += A[K+j]
            ans += ((N-K)//(L-K))*sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)
    
    if not breakflag:
        ans = 0
        for a in A:
            ans += a
    
    print(ans)