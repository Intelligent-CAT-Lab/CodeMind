def f(start, end, interval):
    steps = list(range(start, end + 1, interval))	## steps = CLRJ | start = CLRJ | end = CLRJ | interval = CLRJ
    if 1 in steps:	## steps = CLRJ
        steps[-1] = end + 1
    return len(steps)	## steps = CLRJ
