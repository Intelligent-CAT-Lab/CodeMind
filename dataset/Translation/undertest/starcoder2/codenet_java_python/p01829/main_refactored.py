class main:
    import sys
    
    def dfs(n, s):
        if n == len(ch):
            a = int(S[len(startStr):])
            b = int(s)
            diff = abs(a - b)
            global minDiff, ansStr
            if minDiff > diff:
                ansStr = startStr + s
                minDiff = diff
            return
        for i in range(10):
            if use[i]:
                continue
            use[i] = True
            dfs(n + 1, s + str(i))
            use[i] = False
    
    S = sys.stdin.readline().strip()
    ch = list(S)
    startStr = ""
    ansStr = ""
    use = [False] * 10
    minDiff = sys.maxsize
    dfs(0, "")
    print(ansStr)