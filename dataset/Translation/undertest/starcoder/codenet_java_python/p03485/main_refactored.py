class main:
    import sys
    
    def solve(a, b):
        return (a + b + 1) / 2
    
    if __name__ == "__main__":
        a, b = map(int, sys.stdin.readline().split())
        print(solve(a, b))