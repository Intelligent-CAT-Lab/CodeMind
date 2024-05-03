def f(string):
    if not string or not string[0].isnumeric:	## string = []
        return 'INVALID'
    cur = 0	## cur = []
    for i in range(len(string)):	## i = [] | string = []
        cur = cur * 10 + int(string[i])	## cur = [] | string = [] | i = []
    return str(cur)	## cur = []
