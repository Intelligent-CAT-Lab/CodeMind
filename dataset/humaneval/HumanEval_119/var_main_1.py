def match_parens(lst):
    def check(s):
        val = 0	## val = CLRJ
        for i in s:	## i = CLRJ|s = CLRJ
            if i == '(':	## i = CLRJ
                val = val + 1	## val = CLRJ
            else:
                val = val - 1	## val = CLRJ
            if val < 0:	## val = CLRJ
                return False
        return True if val == 0 else False	## val = CLRJ

    S1 = lst[0] + lst[1]	## S1 = CLRJ|lst = CLRJ
    S2 = lst[1] + lst[0]	## S2 = CLRJ|lst = CLRJ
    return 'Yes' if check(S1) or check(S2) else 'No'
