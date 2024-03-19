def dfs(pos, pace):
    if pos > n:
        return 0
    # 3.0X
    if pace < high:
        npace = 3 * pace
        npos = pos + npace
        if npos == n and (npace == 1 or npace == 3):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    #