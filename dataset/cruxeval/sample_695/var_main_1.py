def f(d):
    result = {}	## result = CLRJ
    for ki, li in d.items():	## d = CLRJ
        result.update({ki: []})
        for kj, dj in enumerate(li):
            result[ki].append({})
            for kk, l in dj.items():
                result[ki][kj][kk] = l.copy()
    return result	## result = CLRJ
