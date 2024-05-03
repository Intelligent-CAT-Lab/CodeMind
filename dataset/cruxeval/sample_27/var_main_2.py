def f(w):
    ls = list(w)	## ls = [] | w = []
    omw = ''	## omw = []
    while len(ls) > 0:	## ls = []
        omw += ls.pop(0)	## omw = [] | ls = []
        if len(ls) * 2 > len(w):	## ls = [] | w = []
            return w[len(ls):] == omw	## w = [] | ls = [] | omw = []
    return False