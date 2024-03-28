class p01829:
    def __init__(self):
        self.use = [False] * 10
        self.min_diff = float('inf')
        self.ans_str = ""
        self.start_str = ""
    
    def dfs(self, n):
        if n == len(self.ch):
            self.ans_str = self.start_str
            return
        
        if n == 0:
            self.use[(int(self.ch[n]) + 5) % 10] = True
            self.start_str += str((int(self.ch[n]) + 5) % 10)
            self.dfs(n + 1)
            return
        
        if not self.use[int(self.ch[n])]:
            self.dfs2(n, "")
            self.use[int(self.ch[n])] = True
            self.start_str += self.ch[n]
            self.dfs(n + 1)
            return
        self.dfs2(n, "")
    
    def dfs2(self, n, s):
        if n == len(self.ch):
            a = int(self.S[self.start_str.__len__():])
            b = int(s)
            diff = abs(a - b)
            
            if self.min_diff > diff:
                self.ans_str = self.start_str + s
                self.min_diff = diff
            return
        
        for i in range(10):
            if self.use[i]:
                continue
            self.use[i] = True
            self.dfs2(n + 1, s + str(i))
            self.use[i] = False

    def solve(self):
        self.S = input()
        self.ch = list(self.S)
        self.start_str = ""
        self.ans_str = ""
        self.dfs(0)
        print(self.ans_str)

if __name__ == '__main__':
    obj = p01829()
    obj.solve()