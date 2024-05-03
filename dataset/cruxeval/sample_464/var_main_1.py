def f(ans):
    if ans.isdecimal():	## ans = CLRJ
        total = int(ans) * 4 - 50	## total = CLRJ | ans = CLRJ
        total -= len([c for c in list(ans) if c not in '02468']) * 100	## total = CLRJ | c = CLRJ | ans = CLRJ
        return total	## total = CLRJ
    return 'NAN'