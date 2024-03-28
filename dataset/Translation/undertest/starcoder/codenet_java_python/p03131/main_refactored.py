class main:
    import sys
    
    def main():
        K, A, B = map(int, sys.stdin.readline().split())
        sum = 1+K
        if A < B:
            sum1 = 1
            if A > sum1:
                K -= (A-sum1)
                sum1 = A
            sum1 += (B-A)*(K//2)
            if K%2 == 1:
                sum1 += 1
            sum = max(sum, sum1)
        print(sum)
    
    if __name__ == '__main__':
        main()