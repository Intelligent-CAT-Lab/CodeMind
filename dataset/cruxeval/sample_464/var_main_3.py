def f(ans):
    if ans.isdecimal():	## <state>ans = CLRJ</state>
        total = int(ans) * 4 - 50	## <state>total = CLRJ | ans = CLRJ</state>
        total -= len([c for c in list(ans) if c not in '02468']) * 100	## <state>total = CLRJ | c = CLRJ | ans = CLRJ</state>
        return total	## <state>total = CLRJ</state>
    return 'NAN'