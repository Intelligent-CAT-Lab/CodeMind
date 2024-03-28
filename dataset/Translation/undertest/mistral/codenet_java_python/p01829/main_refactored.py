class main:
    import sys
    
    def dfs(n):
        if n == len(ch):
            ans_str = start_str
            return
        if n == 0:
            use[ch[n] - '0'] = True
            start_str += chr((ch[n] - '0' + 5) % 10 + '0')
            dfs(n + 1)
            return
        if not use[ch[n] - '0']:
            dfs2(n, "")
            use[ch[n] - '0'] = True
            start_str += ch[n]
            dfs(n + 1)
            return
        dfs2(n, "")
    
    def dfs2(n, s):
        if n == len(ch):
            a = int(S[start_str.index(start_str[-1]):], 10)
            b = int(s, 10)
            diff = abs(a - b)
            if min_diff > diff:
                ans_str = start_str + s
                min_diff = diff
        else:
            for i in range(10):
                if use[i]:
                    continue
                use[i] = True
                dfs2(n + 1, s + chr(i + '0'))
                use[i] = False
    
    def solve():
        S = input()
        ch = S.tochararray()
        start_str = ""
        ans_str = ""
        dfs(0)
        print(ans_str)
    
    if __name__ == "__main__":
        solve()