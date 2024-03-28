class main:
    from math import comb
    from sys import stdin, stdout
    
    class FastScanner:
        def __init__(self):
            self._itr = map(int, stdin.read().split())
        
        def next_int(self):
            return next(self._itr)
    
    def main():
        scan = FastScanner()
        N = scan.next_int()
        K = scan.next_int()
        
        if N == 2:
            if K == 0:
                print(1)
                print("1 2")
            else:
                print(-1)
            return
    
        max_combinations = comb(N - 1, 2)
        if K > max_combinations:
            print(-1)
            return
    
        M = N - 1 + (max_combinations - K)
        print(M)
        for i in range(2, N + 1):
            print("1 {}".format(i))
    
        cnt = max_combinations - K
        if cnt > 0:
            for i in range(2, N):
                for j in range(i + 1, N + 1):
                    print("{} {}".format(i, j))
                    cnt -= 1
                    if cnt <= 0:
                        return
    
    if __name__ == '__main__':
        main()