import math

class p00979:
    
    low = 1
    high = int(math.pow(3, 32))
    n = None
    
    def main(self):
        self.n = int(input())
        if self.n == 0:
            print(-1)
        else:
            print(self.dfs(1, 1) + 1)
    
    def dfs(self, pos, pace):
        if pos > self.n:
            return 0
        # 3.0X
        if pace < self.high:
            npace = 3 * pace
            npos = pos + npace
            if npos == self.n and (npace == 1 or npace == 3):
                return 1
            else:
                if npos > self.n:
                    return 0
                temp = self.dfs(npos, npace)
                if temp!= 0:
                    return 1 + temp
        #