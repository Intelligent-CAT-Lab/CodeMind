def f(dic, value):
    result = []
    for e in dic:
        result.append(e[0])
        if e[1] == value:
            result.reverse()
        else:
            result.append(e[1])
    return result