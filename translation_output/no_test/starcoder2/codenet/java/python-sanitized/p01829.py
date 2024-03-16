import sys

def dfs(n):
    global minDiff, ansStr, startStr
    if n == len(ch):
        ansStr = startStr
        return
    if n == 0:
        use[(ord(ch[n]) - ord('0') + 5) % 10] = True
        startStr = startStr + chr((ord(ch[n]) - ord('0') + 5) % 10 + ord('0'))
        dfs(n + 1)
        return
    if not use[ord(ch[n]) - ord('0')]:
        dfs2(n, "")
        use[ord(ch[n]) - ord('0')] = True
        startStr = startStr + ch[n]
        dfs(n + 1)
        return
    dfs2(n, "")

def dfs2(n, s):
    global minDiff, ansStr, startStr
    if n == len(ch):
        a = int(S[len(startStr):])
        b = int(s)
        diff = abs(a - b)
        if minDiff > diff:
            ansStr = startStr + s
            minDiff = diff
        return
    for i in range(10):
        if use[i]:
            continue
        use[i] = True
        dfs2(n + 1, s + chr(i + ord('0')))
        use[i] = False

S = sys.stdin.readline().strip()
ch = S
use = [False] * 10
minDiff = sys.maxsize
ansStr = ""
startStr = ""
dfs(0)
print(ansStr)