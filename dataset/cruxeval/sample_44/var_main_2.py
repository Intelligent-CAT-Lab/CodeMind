def f(text):
    ls = list(text)	## ls = [] | text = []
    for i in range(0, len(ls)):	## i = [] | ls = []
        if ls[i]!='+':	## ls = [] | i = []
            ls.insert(i, '+')	## ls = [] | i = []
            ls.insert(i, '*')	## ls = [] | i = []
            break
    return '+'.join(ls)	## ls = []
