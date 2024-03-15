import sys

class P02251:
    def solve(self):
        n = self.next_int()
        ans = 0
        
        # 25 cent
        ans += n // 25
        n %= 25
        
        # 10 cent
        ans += n // 10
        n %= 10
        
        # 5 cent
        ans += n // 5
        n %= 5
        
        # 1 cent
        ans += n
        
        print(ans)

    def next_int(self):
        return int(self.next())
    
    def next(self):
        return sys.stdin.readline().strip()
    
    def run(self):
        self.solve()

if __name__ == "__main__":
    P02251().run()