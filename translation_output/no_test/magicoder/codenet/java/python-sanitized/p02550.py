import sys

def main():
    N, X, M = map(int, sys.stdin.readline().split())
    used = set()
    A = [X]
    used.add(X)

    K = 0
    L = 0
    ans = 0
    breakflag = False

    for i in range(M-1):
        prev = A[i]
        now = (prev*prev) % M
        if now == 0:
            ans += sum(A[:i+1])
            breakflag = True
            break
        elif now in used:
            L = i+1
            for j in range(i+1):
                if A[j] == now:
                    K = j
                    break
            ans += sum(A[:K])

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