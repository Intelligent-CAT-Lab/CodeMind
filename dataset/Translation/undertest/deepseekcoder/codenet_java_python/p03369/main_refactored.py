class main:
    import sys
    
    def gs():
        return sys.stdin.readline().strip()
    
    def solve():
        s = gs()
        print((len(s) - s.count('o'))*100 + 700)
    
    if __name__ == "__main__":
        solve()