class main:
    import sys
    
    def solve():
        a = list(map(int, sys.stdin.readline().split()))
        s = []
        for i in range(3):
            s += [chr(ord('a') + i)] * a[i]
    
        while len(s) > 1:
            s.sort()
            last = len(s) - 1
            s[0] = s[0] + s[last]
            s.pop(last)
    
        print(''.join(s))
    
    if __name__ == "__main__":
        solve()