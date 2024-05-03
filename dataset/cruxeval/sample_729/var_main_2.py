def f(s1,s2):
    res = []	## res = []
    i = s1.rfind(s2)	## i = [] | s1 = [] | s2 = []
    while i != -1:	## i = []
        res.append(i+len(s2)-1)	## res = [] | i = [] | s2 = []
        i = s1.rfind(s2, 0, i)	## i = [] | s1 = [] | s2 = []
    return res	## res = []
