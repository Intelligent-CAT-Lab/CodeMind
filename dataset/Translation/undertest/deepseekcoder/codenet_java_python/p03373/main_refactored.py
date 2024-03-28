class main:
    import sys
    
    def solve():
        a = int(input())
        b = int(input())
        c = int(input())
        x = int(input())
        y = int(input())
    
        min_val = sys.maxsize
        for i in range(max(x, y) + 1):
            tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
            min_val = min(min_val, tmp)
    
        print(min_val)
    
    if __name__ == "__main__":
        solve()