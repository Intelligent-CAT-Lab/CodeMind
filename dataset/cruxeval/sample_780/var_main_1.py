def f(ints):
    counts = [0] * 301	## counts = CLRJ

    for i in ints:	## i = CLRJ | ints = CLRJ
        counts[i] += 1	## counts = CLRJ | i = CLRJ

    r = []	## r = CLRJ
    for i in range(len(counts)):	## i = CLRJ | counts = CLRJ
        if counts[i] >= 3:	## counts = CLRJ | i = CLRJ
            r.append(str(i))	## r = CLRJ | i = CLRJ
    counts.clear()	## counts = CLRJ
    return ' '.join(r)	## r = CLRJ
