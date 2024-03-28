class main:
    import sys
    
    def main():
        N, X, M = map(int, sys.stdin.readline().split())
        A = [X]
        used = set([X])
        for i in range(M-1):
            prev = A[-1]
            now = (prev*prev) % M
            if now == 0:
                ans = 0
                for a in A:
                    ans += a
                print(ans)
                return
            if now in used:
                K = A.index(now)
                L = i+1
                sub = 0
                for j in range(K, L):
                    sub += A[j]
                m = (N-K) % (L-K)
                left = 0
                for j in range(m):
                    left += A[K+j]
                ans = ((N-K)/(L-K))*sub + left
                print(ans)
                return
            else:
                used.add(now)
                A.append(now)
        ans = 0
        for a in A:
            ans += a
        print(ans)
    
    if __name__ == '__main__':
        main()