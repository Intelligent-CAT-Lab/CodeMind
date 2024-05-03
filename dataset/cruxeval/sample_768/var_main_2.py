def f(s, o):
    if s.startswith(o):	## s = [] | o = []
        return s	## s = []
    return o + f(s, o[-2::-1])	## o = [] | s = []
