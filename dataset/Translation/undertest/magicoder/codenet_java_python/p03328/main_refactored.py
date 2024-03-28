class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        n = b - a
        print(n * (n + 1) // 2 - b)
    
    if __name__ == "__main__":
        main()