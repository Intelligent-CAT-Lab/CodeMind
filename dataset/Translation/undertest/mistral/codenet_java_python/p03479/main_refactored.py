class main:
    import sys
    
    def solve():
        x, y = map(int, input().split())
        ans = 0
        for i in range(x, y+1, 2):
            ans += 1
        print(ans)
    
    if __name__ == "__main__":
        solve()