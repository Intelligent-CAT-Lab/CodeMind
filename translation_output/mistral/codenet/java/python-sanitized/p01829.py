import sys

def dfs(n):
    if n == len(ch):
        ansStr = startStr
        return
    if n == 0:
        use[ch[n] - '0'] = True
        startStr += chr((ch[n] - '0' + 5) % 10 + '0')
        dfs(n + 1)
        return
    if not use[ch[n] - '0']:
        dfs2(n, "")
        use[ch[n] - '0'] = True
        startStr += ch[n]
        dfs(n + 1)
        return
    dfs2(n, "")

def dfs2(n, s):
    if n == len(ch):
        a = int(S[startStr.index(s):], 10)
        b = int(s, 10)
        diff = abs(a - b)
        if minDiff > diff:
            ansStr = startStr + s
            minDiff = diff
        return
    for i in range(10):
        if use[i]:
            continue
        use[i] = True
        dfs2(n + 1, s + chr(i + '0'))
        use[i] = False

def solve():
    S = input()
    ch = S.tochararray()
    startStr = ""
    ansStr = ""
    dfs(0)
    print(ansStr)

if __name__ == "__main__":
    solve()