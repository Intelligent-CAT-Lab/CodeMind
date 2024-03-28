def dfs(ch, n, use, startStr, S, minDiff, ansStr):
    if n == len(ch):
        ansStr[0] = startStr
        return

    if n == 0:
        use[(int(ch[n]) + 5) % 10] = True
        startStr += str((int(ch[n]) + 5) % 10)
        dfs(ch, n + 1, use, startStr, S, minDiff, ansStr)
        return

    if not use[int(ch[n])]:
        dfs2(ch, n, "", use, startStr, S, minDiff, ansStr)
        use[int(ch[n])] = True
        startStr += ch[n]
        dfs(ch, n + 1, use, startStr, S, minDiff, ansStr)
        return

    dfs2(ch, n, "", use, startStr, S, minDiff, ansStr)


def dfs2(ch, n, s, use, startStr, S, minDiff, ansStr):
    if n == len(ch):
        a = int(S[len(startStr):])
        b = int(s)

        diff = abs(a - b)

        if minDiff[0] > diff:
            ansStr[0] = startStr + s
            minDiff[0] = diff
        return

    for i in range(10):
        if use[i]:
            continue
        use[i] = True
        dfs2(ch, n + 1, s + str(i), use, startStr, S, minDiff, ansStr)
        use[i] = False


def solve(S):
    ch = list(S)
    use = [False] * 10
    startStr = ""
    ansStr = [""]
    minDiff = [float("inf")]
    dfs(ch, 0, use, startStr, S, minDiff, ansStr)
    return ansStr[0]


# Usage Example
if __name__ == "__main__":
    S = input().strip()
    print(solve(S))