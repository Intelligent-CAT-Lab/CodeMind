class main:
    import sys
    
    def solve(a, b):
        res = a
        while a >= b:
            res += a // b
            a = a // b + a % b
        return res
    
    if __name__ == "__main__":
        a, b = map(int, sys.stdin.readline().split())
        print(solve(a, b))