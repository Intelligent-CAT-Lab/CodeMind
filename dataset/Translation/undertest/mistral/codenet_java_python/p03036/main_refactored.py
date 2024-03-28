class main:
    import sys
    
    def solve(r, d, x):
        for i in range(10):
            x = r * x - d
            print(x)
    
    if __name__ == "__main__":
        r = int(input())
        d = int(input())
        x = int(input())
        solve(r, d, x)