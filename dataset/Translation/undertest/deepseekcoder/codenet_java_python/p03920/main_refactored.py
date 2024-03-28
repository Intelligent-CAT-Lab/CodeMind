class main:
    import sys
    
    def p03920():
        N = int(sys.stdin.readline().strip())
        while N > 0:
            sum = 0
            for i in range(1, N+1):
                sum += i
                if sum >= N:
                    print(i)
                    N -= i
                    break
    
    if __name__ == "__main__":
        p03920()