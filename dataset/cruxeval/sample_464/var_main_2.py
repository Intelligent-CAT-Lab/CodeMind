def f(ans):
    if ans.isdecimal():	## ans = []
        total = int(ans) * 4 - 50	## total = [] | ans = []
        total -= len([c for c in list(ans) if c not in '02468']) * 100	## total = [] | c = [] | ans = []
        return total	## total = []
    return 'NAN'