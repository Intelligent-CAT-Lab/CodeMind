def f(ip, n):
    i = 0
    out = ''
    for c in ip:
        if i == n:
            out += '\n'
            i = 0
        i += 1
        out += c
    return out