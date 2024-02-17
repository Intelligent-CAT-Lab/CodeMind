def f(string):
    if not string or not string[0].isnumeric:
        return 'INVALID'
    cur = 0
    for i in range(len(string)):
        cur = cur * 10 + int(string[i])
    return str(cur)