def f(ints):
    counts = [0] * 301	## <state>counts = CLRJ</state>

    for i in ints:	## <state>i = CLRJ | ints = CLRJ</state>
        counts[i] += 1	## <state>counts = CLRJ | i = CLRJ</state>

    r = []	## <state>r = CLRJ</state>
    for i in range(len(counts)):	## <state>i = CLRJ | counts = CLRJ</state>
        if counts[i] >= 3:	## <state>counts = CLRJ | i = CLRJ</state>
            r.append(str(i))	## <state>r = CLRJ | i = CLRJ</state>
    counts.clear()	## <state>counts = CLRJ</state>
    return ' '.join(r)	## <state>r = CLRJ</state>
