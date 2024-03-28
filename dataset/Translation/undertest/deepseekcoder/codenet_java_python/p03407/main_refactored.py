class main:
    import sys
    
    def solve(inp):
        a, b, c = map(int, inp.split())
        return "Yes" if a + b >= c else "No"
    
    if __name__ == "__main__":
        print(solve(sys.stdin.readline().strip()))