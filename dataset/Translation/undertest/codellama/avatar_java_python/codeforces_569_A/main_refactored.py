class main:
    import sys
    
    def solve(t, s, q):
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        return sum
    
    if __name__ == "__main__":
        t, s, q = map(int, sys.stdin.readline().split())
        print(solve(t, s, q))