class main:
    import sys
    
    def p02338():
        n, k = map(int, sys.stdin.readline().strip().split())
        if n <= k:
            print(1)
        else:
            print(0)
    
    if __name__ == "__main__":
        p02338()