def f(s):
    count = 0	## count = []
    for c in s:	## c = [] | s = []
        if s.rindex(c) != s.index(c):	## s = [] | c = []
            count+=1	## count = []
    return count	## count = []
