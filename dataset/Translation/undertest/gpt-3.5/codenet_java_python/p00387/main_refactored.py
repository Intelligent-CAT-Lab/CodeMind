class main:
    import sys
    import math
    
    def solve(a, b):
        print(max(1, (b+a-1)//a))
    
    if __name__ == "__main__":
        a, b = map(int, input().split())
        solve(a, b)