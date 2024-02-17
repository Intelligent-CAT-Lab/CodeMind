def f(body):
    ls = list(body)
    dist = 0
    for i in range(0, len(ls) - 1):
        if ls[i - 2 if i - 2 >= 0 else 0] == '\t':
            dist += (1 + ls[i - 1].count('\t')) * 3
        ls[i] = '[' + ls[i] + ']'
    return ''.join(ls).expandtabs(4 + dist)