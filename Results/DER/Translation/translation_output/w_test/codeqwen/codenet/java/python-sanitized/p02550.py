def main():
    N, X, M = map(int, input().split())
    used = set()
    A = [X]
    used.add(X)

    K = 0
    L = 0
    ans = 0
    breakflag = False

    for i in range(M-1, min(M-1, N-1)):
        prev = A[i]
        now = (prev*prev) % M
        if now == 0:
            ans += sum(A)
            breakflag = True
            break
        elif now in used:
            L = i+1
            for j in range(K, L):
                if A[j] == now:
                    K = j
                    break
                ans += A[j]

            sub = 0
            for j in range(K, L):
                sub += A[j]

            m = (N-K) % (L-K)
            left = 0
            for j in range(m):
                left += A[K + j]

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