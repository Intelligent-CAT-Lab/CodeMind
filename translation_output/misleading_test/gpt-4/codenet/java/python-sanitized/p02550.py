N, X, M = map(int, input().split())
used = set()
A = [X]
used.add(X)

K = 0
L = 0
ans = 0
breakflag = False

for i in range(min(M-1, N-1)):
    prev = A[i]
    now = (prev * prev) % M
    if now == 0:
        ans += sum(A[:i+1])
        breakflag = True
        break
    elif now in used:
        L = i + 1
        for j in range(i + 1):
            if A[j] == now:
                K = j
                break
            ans += A[j]
            
        sub = sum(A[int(K):L])
        
        m = (N - K) % (L - K)
        left = sum(A[int(K): int(K) + m])
        
        ans += ((N - K) // (L - K)) * sub + left
        breakflag = True
        break
    else:
        used.add(now)
        A.append(now)

if not breakflag:
    ans = sum(A)

print(ans)