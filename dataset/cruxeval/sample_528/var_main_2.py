def f(s):
    b = ''	## b = []
    c = ''	## c = []
    for i in s:	## i = [] | s = []
        c = c + i	## c = [] | i = []
        if s.rfind(c) > -1:	## s = [] | c = []
            return s.rfind(c)	## s = [] | c = []
    return 0