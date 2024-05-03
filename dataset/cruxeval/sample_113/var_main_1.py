def f(line):
    count = 0	## count = CLRJ
    a = []	## a = CLRJ
    for i in range(len(line)):	## i = CLRJ | line = CLRJ
        count += 1	## count = CLRJ
        if count%2==0:	## count = CLRJ
            a.append(line[i].swapcase())	## a = CLRJ | line = CLRJ | i = CLRJ
        else:
            a.append(line[i])	## a = CLRJ | line = CLRJ | i = CLRJ
    return ''.join(a)	## a = CLRJ
