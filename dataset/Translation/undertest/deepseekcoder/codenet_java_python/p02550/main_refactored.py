class main:
    import sys
    
    def main():
        N, X, M = map(int, sys.stdin.readline().split())
        used = {X}
        A = [X]
        K = L = ans = 0
        break_flag = False
    
        for i in range(M-1):
            prev = A[i]
            now = (prev*prev) % M
            if now == 0:
                ans = sum(A[:i+1])
                break_flag = True
                break
            elif now in used:
                L = i+1
                for j, num in enumerate(A[:i+1]):
                    if num == now:
                        K = j
                        break
                ans += sum(A[K:L])
                sub = sum(A[K:L])
                m = (N-K) % (L-K)
                left = sum(A[K:K+m])
                ans += ((N-K)//(L-K))*sub + left
                break_flag = True
                break
            else:
                used.add(now)
                A.append(now)
    
        if not break_flag:
            ans = sum(A)
    
        print(ans)
    
    if __name__ == "__main__":
        main()