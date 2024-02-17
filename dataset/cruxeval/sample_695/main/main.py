def f(d):
    result = {}
    for ki, li in list(d.items()):
        result.update({ki: []})
        for kj, dj in enumerate(li):
            result[ki].append({})
            for kk, l in list(dj.items()):
                result[ki][kj][kk] = l.copy()
    return result