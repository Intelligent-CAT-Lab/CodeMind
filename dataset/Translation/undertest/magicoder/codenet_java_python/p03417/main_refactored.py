class main:
    import sys
    
    def main():
        N, M = map(int, sys.stdin.readline().split())
        print(abs((N-2) * (M-2)))
    
    if __name__ == "__main__":
        main()