def solve(s):
    flg = 0	## flg = CLRJ
    idx = 0	## idx = CLRJ
    new_str = list(s)	## new_str = CLRJ|s = CLRJ
    for i in s:	## i = CLRJ|s = CLRJ
        if i.isalpha():	## i = CLRJ
            new_str[idx] = i.swapcase()	## new_str = CLRJ|idx = CLRJ|i = CLRJ
            flg = 1	## flg = CLRJ
        idx += 1	## idx = CLRJ
    s = ""	## s = CLRJ
    for i in new_str:	## i = CLRJ|new_str = CLRJ
        s += i	## s = CLRJ|i = CLRJ
    if flg == 0:	## flg = CLRJ
        return s[len(s)::-1]
    return s	## s = CLRJ
