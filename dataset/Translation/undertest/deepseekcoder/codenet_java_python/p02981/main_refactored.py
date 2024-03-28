class main:
    import sys
    
    def solve(is, os):
        n, a, b = map(int, is.readline().split())
        os.write(str(min(a * n, b)) + '\n')
    
    def main():
        solve(sys.stdin, sys.stdout)
    
    if __name__ == "__main__":
        main()