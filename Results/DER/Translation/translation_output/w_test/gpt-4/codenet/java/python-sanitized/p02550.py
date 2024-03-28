def p02550(N, X, M):
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
            ans = sum(A[:i+1])
            breakflag = True
            break
        elif now in used:
            L = i + 1
            for j, a in enumerate(A):
                if a == now:
                    K = j
                    break
                ans += a

            sub = sum(A[K:L])

            m = (N - K) % (L - K)
            left = sum(A[K:K+m])

            ans += ((N - K) // (L - K)) * sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = sum(A)

    return ans

# Sample Test Case
N, X, M = map(int, input().split())
print(p02550(N, X, M))