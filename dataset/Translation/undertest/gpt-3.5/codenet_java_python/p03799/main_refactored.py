class main:
    def main():
        N, M = map(int, input().split())
        ans = 0
    
        if N > M:
            print(M//2)
            return
    
        if N == 1 and M == 1:
            print(0)
            return
    
        if N == 2 and M == 1:
            print(0)
            return
    
        if N * 2 > M:
            print(M//2)
            return
    
        ans = N + ((M - N * 2) // 4)
        print(ans)
    
    if __name__ == "__main__":
        main()