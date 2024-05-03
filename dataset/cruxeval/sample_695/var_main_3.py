def f(d):
    result = {}	## <state>result = CLRJ</state>
    for ki, li in d.items():	## <state>d = CLRJ</state>
        result.update({ki: []})
        for kj, dj in enumerate(li):
            result[ki].append({})
            for kk, l in dj.items():
                result[ki][kj][kk] = l.copy()
    return result	## <state>result = CLRJ</state>
