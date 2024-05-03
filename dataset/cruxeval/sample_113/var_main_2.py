def f(line):
    count = 0	## count = []
    a = []	## a = []
    for i in range(len(line)):	## i = [] | line = []
        count += 1	## count = []
        if count%2==0:	## count = []
            a.append(line[i].swapcase())	## a = [] | line = [] | i = []
        else:
            a.append(line[i])	## a = [] | line = [] | i = []
    return ''.join(a)	## a = []
