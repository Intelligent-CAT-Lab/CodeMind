class main:
    def solve(r, d, x):
        for i in range(10):
            x = r * x - d
            print(x)
    
    if __name__ == "__main__":
        r, d, x = map(int, input().split())
        solve(r, d, x)