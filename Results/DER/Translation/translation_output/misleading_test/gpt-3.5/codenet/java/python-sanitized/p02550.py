def main():
    N, X, M = map(int, input().split())
    used = set()
    A = [X]
    used.add(X)

    K, L, ans = 0, 0, 0
    breakflag = False

    for i in range(M-1 if M<N else N-1):
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
                ans += A[j]

            sub = sum(A[K:L])

            m = (N-K) % (L-K)
            left = sum(A[K:K+m])

            ans += ((N-K)//(L-K))*sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = sum(A)

    print(ans)

if __name__ == "__main__":
    main()