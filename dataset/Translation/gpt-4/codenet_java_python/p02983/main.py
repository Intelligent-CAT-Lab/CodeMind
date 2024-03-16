import sys

class FastReader:
    def __init__(self):
        self.stdin = sys.stdin
    
    def next(self):
        while True:
            if not hasattr(self, '_st') or not self._st:
                try:
                    self._st = input().split()
                except EOFError:
                    return None
            if self._st:
                return self._st.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())  # Assuming Python int can handle long values
    
    def next_double(self):
        return float(self.next())
    
    def next_line(self):
        try:
            return input()
        except EOFError:
            return None

class Solution:
    def solve(self):
        sc = FastReader()
        
        L = sc.next_int()
        R = sc.next_int()

        R -= L
        L %= 2019
        R += L

        res = 2019  # max value

        if R - L > 2019:
            print(0)
            return
        
        for i in range(L, R + 1):
            for j in range(L, i):
                res = min(res, (i * j) % 2019)
        
        print(res)

if __name__ == "__main__":
    ob = Solution()

    ob.solve()