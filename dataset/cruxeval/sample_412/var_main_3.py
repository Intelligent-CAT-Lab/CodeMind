def f(start, end, interval):
    steps = list(range(start, end + 1, interval))	## <state>steps = CLRJ | start = CLRJ | end = CLRJ | interval = CLRJ</state>
    if 1 in steps:	## <state>steps = CLRJ</state>
        steps[-1] = end + 1
    return len(steps)	## <state>steps = CLRJ</state>
