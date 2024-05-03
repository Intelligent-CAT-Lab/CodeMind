def f(start, end, interval):
    steps = list(range(start, end + 1, interval))	## steps = [] | start = [] | end = [] | interval = []
    if 1 in steps:	## steps = []
        steps[-1] = end + 1
    return len(steps)	## steps = []
