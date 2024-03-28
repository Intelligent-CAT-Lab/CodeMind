class main:
    import sys
    
    def solve(n, a, b):
        return min(a * n, b)
    
    def main():
        n, a, b = map(int, sys.stdin.readline().split())
        print(solve(n, a, b))
    
    if __name__ == '__main__':
        main()