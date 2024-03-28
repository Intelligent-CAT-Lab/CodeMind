class main:
    import sys
    
    def solve(r1, r2):
        return 1 / (1 / r1 + 1 / r2)
    
    def main():
        r1, r2 = map(float, sys.stdin.readline().split())
        print(solve(r1, r2))
    
    if __name__ == "__main__":
        main()