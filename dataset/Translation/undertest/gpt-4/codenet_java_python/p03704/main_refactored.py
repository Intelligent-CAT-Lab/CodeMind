class main:
    def solve(D):
        ans = 0
        for len_ in range(len(str(D)), 19):
            res = dfs(D, 0, len_)
            ans += res
        print(ans)
    
    
    def dfs(rem, pos, len_):
        if len_ - pos - 1 < pos:
            return 1 if rem == 0 else 0
        if pos == len_ - 1 - pos:
            return 10 if rem == 0 else 0
        
        d = 10 ** (len_ - pos - 1)
        dm = 10 ** pos
        d -= dm
        if abs(rem) >= 10 * d:
            return 0
        ret = 0
        for i in range(-9, 10):
            if pos == 0 and i >= 0:
                ret += dfs(rem - d * i, pos + 1, len_) * (9 - abs(i))
            else:
                ret += dfs(rem - d * i, pos + 1, len_) * (10 - abs(i))
        return ret
    
    
    def main():
        # Assuming sys.stdin.read() provides the input stream in a similar way as Scanner(System.in) in Java
        import sys
        D = int(sys.stdin.read().strip())
        solve(D)
    
    
    if __name__ == '__main__':
        # Replace this with actual test input or use sys.stdin.read()
        INPUT = "63"
        sys.stdin = io.StringIO(INPUT)
    
        main()