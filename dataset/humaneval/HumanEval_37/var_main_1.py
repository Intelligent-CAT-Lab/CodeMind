def sort_even(l: list):
    evens = l[::2]	## evens = CLRJ|l = CLRJ
    odds = l[1::2]	## odds = CLRJ|l = CLRJ
    evens.sort()	## evens = CLRJ
    ans = []	## ans = CLRJ
    for e, o in zip(evens, odds):	## e = CLRJ|o = CLRJ|evens = CLRJ|odds = CLRJ
        ans.extend([e, o])	## ans = CLRJ|e = CLRJ|o = CLRJ
    if len(evens) > len(odds):	## evens = CLRJ|odds = CLRJ
        ans.append(evens[-1])	## ans = CLRJ|evens = CLRJ
    return ans	## ans = CLRJ
