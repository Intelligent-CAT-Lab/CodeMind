Below is the Java code provided translated into Python. Note that Python doesn't have a built-in input stream and buffer reading facility similar to that of Java's, so for simplicity, we'll use the built-in `input()` function for reading input from the user. Also, Java classes and methods are structured quite differently from Python's, so the translation involves changes in the class design and also simplifications where appropriate.

```python
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
```

To run the test case provided (for input 201), you would simply run the Python script and when prompted, enter '201'. The expected output (according to the Java program) will be '701'.
