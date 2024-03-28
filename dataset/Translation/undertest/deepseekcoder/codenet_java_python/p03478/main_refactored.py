class main:
    import sys
    
    def main():
        N, A, B = map(int, sys.stdin.readline().split())
        ans = 0
        for i in range(1, N+1):
            sum_digits = sum(int(digit) for digit in str(i))
            if A <= sum_digits <= B:
                ans += i
        print(ans)
    
    if __name__ == "__main__":
        main()